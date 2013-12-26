package com.sample.twitter.interceptor;

import javax.annotation.Resource;

import org.aopalliance.intercept.MethodInvocation;
import org.seasar.framework.aop.interceptors.AbstractInterceptor;
import org.seasar.struts.annotation.Execute;

import com.sample.twitter.dto.SessionDto;

public class LoginConfirmInterceptor extends AbstractInterceptor {
	
	private static final long serialVersionUID = 1L;
	
	@Resource
	public SessionDto sessionDto;
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO 自動生成されたメソッド・スタブ
		return (!isExecuteMethod(invocation) || isLoggedIn()) ? invocation
				.proceed() : "/login/redirect=true";
	}
		
	private boolean isExecuteMethod(MethodInvocation invocation) {
		return invocation.getMethod().isAnnotationPresent(Execute.class);
	}
	
	private boolean isLoggedIn() {
		return (sessionDto != null && sessionDto.userId != 0);
	}

}
