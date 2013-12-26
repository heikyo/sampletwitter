package com.sample.twitter.form;

import org.seasar.struts.annotation.Required;

public class RegisterForm {
	
	@Required
	public String registerName;
	@Required
	public String registerEmail;
	@Required
	public String registerPass;

}
