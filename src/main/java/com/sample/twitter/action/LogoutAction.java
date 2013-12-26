package com.sample.twitter.action;

import javax.annotation.Resource;

import org.seasar.framework.aop.annotation.RemoveSession;
import org.seasar.struts.annotation.Execute;

import com.sample.twitter.dto.SessionDto;

public class LogoutAction {
	
	@Resource
	public SessionDto sessionDto;
	
	@Execute(validator=false)
	@RemoveSession(name="sessionDto")
	public String index() {
		return "/login=redirect=true";
	}

}
