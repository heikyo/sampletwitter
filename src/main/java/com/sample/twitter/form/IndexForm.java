package com.sample.twitter.form;

import org.seasar.struts.annotation.Required;

public class IndexForm {
	
	@Required
	public int value;
	public int relationId;
	public int deleteTweetId;
	public int page;
	public String memberName;
	public String tweetContent;
	public String query;
	public String q;
	

}
