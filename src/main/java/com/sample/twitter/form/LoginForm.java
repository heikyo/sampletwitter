package com.sample.twitter.form;

import org.seasar.struts.annotation.Required;

public class LoginForm {
	@Required
	public String loginName;
	@Required
	public String loginPass;
}
