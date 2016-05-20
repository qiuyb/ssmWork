package com.yc.vote.web.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import com.yc.vote.util.VoteData;
/**
 * 用户登录校验拦截器
 * @author qyb
 *
 */
public class LoginInterceptor extends MethodFilterInterceptor{

	private static final long serialVersionUID = 1307687631270550421L;

	@Override
	protected String doIntercept(ActionInvocation invation) throws Exception {
		Map<String,Object> session=ActionContext.getContext().getSession();   //取到session的封装类
		Object obj=session.get(VoteData.LOGIN_USER);
		if(obj == null){
			session.put(VoteData.ERROR_MSG, "请登录后在进行操作...");
			return "login";
		}
		return invation.invoke();
	}

}
