package com.sample.twitter.action;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.annotation.Resource;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

import org.seasar.framework.util.Base64Util;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.exception.ActionMessagesException;

import com.sample.twitter.dbflute.cbean.UserCB;
import com.sample.twitter.dbflute.exbhv.UserBhv;
import com.sample.twitter.dbflute.exentity.User;
import com.sample.twitter.dto.BlowfishDto;
import com.sample.twitter.dto.SessionDto;
import com.sample.twitter.form.LoginForm;

public class LoginAction {
	
	@Resource
	@ActionForm
	protected LoginForm loginForm;
	
	@Resource
	protected UserBhv userBhv;
	
	@Resource
	protected BlowfishDto blowfishDto;
	
	@Resource
	public SessionDto sessionDto;
	
	@Execute(validator=false)
	public String index() {
		return "index.jsp";
	}
	
	@Execute(validator=true, input="index.jsp")
	public String login() throws Throwable, NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
		UserCB cb = new UserCB();
		String encodedPass = getEncodedPass();
		cb.query().setEmail_Equal(loginForm.loginName);
		cb.query().setPassword_Equal(encodedPass);
		User user = userBhv.selectEntity(cb);
		if (user == null) {
			throw new ActionMessagesException("aaaa",false);
		}
		sessionDto.userId = user.getId();
		sessionDto.username = user.getUsername();
		return "/?redirect=true";
	}
	
	@Execute(validator=false)
	public String toregister() {		
		
		return "/register?redirect=true";
	}
	
	protected String getEncodedPass() throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		SecretKeySpec sksSpec = new SecretKeySpec(blowfishDto.key.getBytes(), blowfishDto.algorithm);
		Cipher cipher = Cipher.getInstance(blowfishDto.mode);
		cipher.init(Cipher.ENCRYPT_MODE, sksSpec);
		byte[] en = cipher.doFinal(loginForm.loginPass.getBytes());
		String encoded = Base64Util.encode(en);
		return encoded;
	}
}
