package com.yc.vote.web.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
/**
 * 用户登录校验拦截器
 * @author qyb
 *
 */
public class LoginInterceptor02 implements Interceptor {

	private static final long serialVersionUID = 1307687631270550421L;

	@Override
	public void destroy() {
	}

	@Override
	public void init() {
	}

	@Override
	public String intercept(ActionInvocation invation) throws Exception {
		Map<String,Object> session=ActionContext.getContext().getSession();   //取到session的封装类
		Object obj=session.get("user");
		if(obj == null){
			session.put("errorMsg", "请登录后在进行操作...");
			return "login";
		}
		return invation.invoke();
	}

}
