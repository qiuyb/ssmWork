package com.yc.vote.web.action;

import java.util.Map;
import java.util.UUID;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.yc.vote.entity.User;
import com.yc.vote.service.UserService;
import com.yc.vote.service.VoteService;
import com.yc.vote.util.VoteData;

@Controller("userAction")
public class UserAction implements ModelDriven<User>,SessionAware{
	@Autowired
	private UserService userService;
	@Autowired
	private User user;
	@Autowired
	private VoteService voteService;
	
	@Autowired
	private JavaMailSender javaMailSender;   //邮件发送对象
	
	private Map<String, Object> session;


	//打开登录界面
	public String login(){
		return "login";
	}

	//首页主题列表信息
	public String list(){
		if(userService.login1(user)==false){
			session.put(VoteData.ERROR_MSG, "用户名或密码错误...");
			return "login";
		}else{
			if(userService.login2(user)==false){
				session.put(VoteData.ERROR_MSG, "账户未激活...<a href='Jihuo.action'>前往激活</a>");
				return "login";
			}else{
				User result=userService.login(user);
				session.put(VoteData.LOGIN_USER, result);
				return "list";
			}
		}
	}
	
	//激活
	public String jihuo(){
		User us=userService.find(user);
		if(us==null){
			session.put("jihuoMsg", "您所填信息与注册信息不一致...");
			return "jihuo";
		}
		return "jihuo_success";
	}
	
	//注册
	public String register(){
		int result=userService.register(user);
		if(result==1){
			return "reg_success";
		}
		return "reg_fail";
	}

	//发送激活账户邮件
	public String sendEmail(){
		MimeMessage mm=javaMailSender.createMimeMessage();  ////邮件信息类
		try {
			MimeMessageHelper smm=new MimeMessageHelper(mm,true);
			smm.setFrom("studymail_test@163.com");      //邮件发送者
			smm.setTo(user.getVuemail());      //邮件接收者
			smm.setSubject("投票系统账户激活");    //邮件主题
			String actionId=UUID.randomUUID().toString();   //激活号
			String activePath="http://localhost:8080/vote/user_active.action?actionId="+actionId;  //激活路径
			
			smm.setText("激活账号：<a href='"+activePath+"'>"+activePath+"</a>",true);    //邮件内容
			javaMailSender.send(mm);    //发送邮件
			ActionContext.getContext().getSession().put("actionId", actionId);
			ActionContext.getContext().getSession().put("vuemail",user.getVuemail());
			System.out.println("邮件发送成功....");
			return "success";
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		session.put("jihuoMsg", "激活邮件发送失败...");
		return "jihuo";
	}
	
	//
	public String active(){
		return "active";
	}
	
	public String check(){
		String actionId1=ServletActionContext.getRequest().getParameter("actionId");
		String actionId2=(String) ActionContext.getContext().getSession().get("actionId");
		String vuemail=(String) ActionContext.getContext().getSession().get("vuemail");
		
		if(actionId1.equals(actionId2)){
			int result=userService.update(vuemail);
			if(result==1){
				session.put(VoteData.ERROR_MSG, "激活成功，重新登录...");
				return "login";
			}
			return "active";
		}
		return "active";
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}

	@Override
	public User getModel() {
		return user;
	}
	
}
