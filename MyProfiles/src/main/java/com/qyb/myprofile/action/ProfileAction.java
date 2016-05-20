package com.qyb.myprofile.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.qyb.myprofile.entity.Profile;
import com.qyb.myprofile.service.ProfileService;

@Controller("ProfileAction")
public class ProfileAction implements ModelDriven<Profile>,SessionAware {
	@Autowired
	private ProfileService profileService;
	private Profile pf;
	private Map<String, Object> session;
	
	public Profile getPf() {
		return pf;
	}

	public void setPf(Profile pf) {
		this.pf = pf;
	}

	//判断查询人员列表是否成功
	public String execute(){
		find();
		return "list";
	}
	
	//根据编号显示详细信息
	public String detail(){
		pf=profileService.findById(pf.getId());
		
		if(pf!=null){
			session.put("detail", pf);
			return "detail";
		}
		return "fail";
	}
	
	public String update(){
		pf=profileService.findById(pf.getId());
		
		if(pf!=null){
			session.put("update", pf);
			return "update";
		}
		return "fail";
	}
	
	public String fan(){
		return "fan";
	}
	
	//根据id修改人员信息
	public String xiu(){
		int num=profileService.update(pf);
		if(num>0){
			find();
			return "fan";
		}
		return "fail";
	}
	
	public void find(){
		List<Profile> profiles=profileService.find();
		
		if(profiles!=null&&profiles.size()>0){
			session.put("profile", profiles);
		}
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}

	@Override
	public Profile getModel() {
		this.pf=new Profile();
		return pf;
	}
}
