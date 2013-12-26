/*
 * Copyright 2004-2008 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.sample.twitter.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.seasar.dbflute.cbean.PagingResultBean;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.cbean.UnionQuery;
import org.seasar.dbflute.cbean.coption.LikeSearchOption;
import org.seasar.dbflute.cbean.pagenavi.range.PageRangeOption;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.sample.twitter.dbflute.cbean.RelationshipCB;
import com.sample.twitter.dbflute.cbean.TweetCB;
import com.sample.twitter.dbflute.cbean.UserCB;
import com.sample.twitter.dbflute.exbhv.RelationshipBhv;
import com.sample.twitter.dbflute.exbhv.TweetBhv;
import com.sample.twitter.dbflute.exbhv.UserBhv;
import com.sample.twitter.dbflute.exentity.Relationship;
import com.sample.twitter.dbflute.exentity.Tweet;
import com.sample.twitter.dbflute.exentity.User;
import com.sample.twitter.dto.MemberDto;
import com.sample.twitter.dto.SessionDto;
import com.sample.twitter.dto.TweetDto;
import com.sample.twitter.dto.UserStatusDto;
import com.sample.twitter.form.IndexForm;

public class IndexAction {
	
	
	@Resource
	@ActionForm
	protected IndexForm indexForm;
	@Resource
	protected TweetBhv tweetBhv;
	@Resource
	public SessionDto sessionDto;
	@Resource
	protected UserStatusDto userStatusDto;
	@Resource
	public MemberDto memberDto;
	@Resource
	protected UserBhv userBhv;
	@Resource
	protected RelationshipBhv relationshipBhv;


	public List<TweetDto> tweetList;
	public List<UserStatusDto> userList;
	public List<Integer> numberList;
	public int followingCount;
	public int followerCount;
	public int myTweetCount;
	
	public int memberfollowingCount;
	public int memberfollowerCount;
	public int memberTweetCount;
	
	public int recordCount;
	public int pageCount;
	public String memberName;
	public int memberId;
	final int Following = 0;
	final int Follower = 1;
	final int parpage_num = 10;
	
	@Execute(validator=false)
	public String index() {
		TweetCB cb = getUserCB_Toppage();
		cb.paging(parpage_num, 1);
		PagingResultBean<Tweet> list = tweetBhv.selectPage(cb);
		PageRangeOption option = setPageRangeOption();
		list.setPageRangeOption(option);
		numberList = list.pageRange().createPageNumberList();
		this.tweetList = getTweetList(list);
		setCounter(sessionDto.userId);
		memberName = sessionDto.username;
		memberId = sessionDto.userId;
		return "mypage.jsp";
	}
	
	@Execute(validator=false, urlPattern="/?page={page}")
	public String top_paging() {
		TweetCB cb = getUserCB_Toppage();
		cb.paging(parpage_num, indexForm.page);
		PagingResultBean<Tweet> list = tweetBhv.selectPage(cb);
		PageRangeOption option = setPageRangeOption();
		list.setPageRangeOption(option);
		numberList = list.pageRange().createPageNumberList();
		this.tweetList = getTweetList(list);
		setCounter(sessionDto.userId);
		memberName = sessionDto.username;
		memberId = sessionDto.userId;
		return "mypage.jsp";
	}
	
	private TweetCB getUserCB_Toppage() {
		TweetCB cb = new TweetCB();
		cb.setupSelect_User();
		cb.query().queryUser().existsRelationshipByFollowedIdList(new SubQuery<RelationshipCB>() {
			public void query(RelationshipCB cb) {
				cb.query().setFollowId_Equal(sessionDto.userId);
			}
		});
		cb.union(new UnionQuery<TweetCB>() {
		    public void query(TweetCB unionCB) {
		        unionCB.query().setUserId_Equal(sessionDto.userId);;
		    }
		});
		cb.query().addOrderBy_CreateAt_Desc();
		return cb;
	}
	
/*
 * following関係
 */
	@Execute(validator=false, urlPattern="following")
	public String following() {
		UserCB cb = getUserCB(sessionDto.userId,Following);
		cb.paging(parpage_num, 1);
		PagingResultBean<User> list = userBhv.selectPage(cb);
		PageRangeOption option = setPageRangeOption();
		list.setPageRangeOption(option);
		numberList = list.pageRange().createPageNumberList();
		this.userList = getUserList(list);
		setCounter(sessionDto.userId);
		setMemberDto(sessionDto.userId);
		return "following.jsp";
	}
	
	@Execute(validator=false, urlPattern="following&page={page}")
	public String following_paging() {
		UserCB cb = getUserCB(sessionDto.userId,Following);
		cb.paging(parpage_num, indexForm.page);
		PagingResultBean<User> list = userBhv.selectPage(cb);
		PageRangeOption option = setPageRangeOption();
		list.setPageRangeOption(option);
		numberList = list.pageRange().createPageNumberList();
		this.userList = getUserList(list);
		setCounter(sessionDto.userId);
		setMemberDto(sessionDto.userId);
		return "following.jsp";
	}
	
	@Execute(validator=false, urlPattern="id={value}/following")
	public String memberfollowing() {
		if(indexForm.value == sessionDto.userId) {
			return "/following?redirect=true";
		}
		UserCB cb = getUserCB(indexForm.value,Following);
		cb.paging(parpage_num, indexForm.page);
		PagingResultBean<User> list = userBhv.selectPage(cb);
		PageRangeOption option = setPageRangeOption();
		list.setPageRangeOption(option);
		numberList = list.pageRange().createPageNumberList();
		this.userList = getUserList(list);
		setCounter(indexForm.value);
		setMemberDto(indexForm.value);
		return "following.jsp";
	}
	
	@Execute(validator=false, urlPattern="id={value}/following&page={page}")
	public String memberfollowing_paging() {
		if(indexForm.value == sessionDto.userId) {
			return "/following?redirect=true";
		}
		UserCB cb = getUserCB(indexForm.value,Following);
		cb.paging(parpage_num, indexForm.page);
		PagingResultBean<User> list = userBhv.selectPage(cb);
		PageRangeOption option = setPageRangeOption();
		list.setPageRangeOption(option);
		numberList = list.pageRange().createPageNumberList();
		this.userList = getUserList(list);
		setCounter(indexForm.value);
		setMemberDto(indexForm.value);
		return "following.jsp";
	}
	
/*
 * follower関係
 */
	
	@Execute(validator=false, urlPattern="follower")
	public String follower() {
		UserCB cb = getUserCB(sessionDto.userId,Follower);
		cb.paging(parpage_num, 1);
		PagingResultBean<User> list = userBhv.selectPage(cb);
		PageRangeOption option = setPageRangeOption();
		list.setPageRangeOption(option);
		numberList = list.pageRange().createPageNumberList();
		this.userList = getUserList(list);
		setCounter(sessionDto.userId);
		setMemberDto(sessionDto.userId);
		return "follower.jsp";
	}
	
	@Execute(validator=false, urlPattern="follower&page={page}")
	public String follower_paging() {
		UserCB cb = getUserCB(sessionDto.userId,Follower);
		cb.paging(parpage_num, indexForm.page);
		PagingResultBean<User> list = userBhv.selectPage(cb);
		PageRangeOption option = setPageRangeOption();
		list.setPageRangeOption(option);
		numberList = list.pageRange().createPageNumberList();
		this.userList = getUserList(list);
		setCounter(sessionDto.userId);
		setMemberDto(sessionDto.userId);
		return "follower.jsp";
	}
	
	@Execute(validator=false, urlPattern="id={value}/follower")
	public String memberfollower() {
		if(indexForm.value == sessionDto.userId) {
			return "/follower?redirect=true";
		}
		UserCB cb = getUserCB(indexForm.value,Follower);
		cb.paging(parpage_num, 1);
		PagingResultBean<User> list = userBhv.selectPage(cb);
		PageRangeOption option = setPageRangeOption();
		list.setPageRangeOption(option);
		numberList = list.pageRange().createPageNumberList();
		this.userList = getUserList(list);
		setCounter(indexForm.value);
		setMemberDto(indexForm.value);
		return "follower.jsp";
	}
	
	@Execute(validator=false, urlPattern="id={value}/follower&page={page}")
	public String memberfollower_paging() {
		if(indexForm.value == sessionDto.userId) {
			return "/follower?redirect=true";
		}
		UserCB cb = getUserCB(indexForm.value,Follower);
		cb.paging(parpage_num, indexForm.page);
		PagingResultBean<User> list = userBhv.selectPage(cb);
		PageRangeOption option = setPageRangeOption();
		list.setPageRangeOption(option);
		numberList = list.pageRange().createPageNumberList();
		this.userList = getUserList(list);
		setCounter(indexForm.value);
		setMemberDto(indexForm.value);
		return "follower.jsp";
	}
/*
 * mytweet関連
 */
	
	@Execute(validator=false, urlPattern="tweet")
	public String mytweet() {
		TweetCB cb = getTweetCB(sessionDto.userId); 
		cb.paging(parpage_num, 1);
		PagingResultBean<Tweet> list = tweetBhv.selectPage(cb);
		PageRangeOption option = setPageRangeOption();
		list.setPageRangeOption(option);
		numberList = list.pageRange().createPageNumberList();
		this.tweetList = getTweetList(list);
		setCounter(sessionDto.userId);
		setMemberDto(sessionDto.userId);
		return "mytweet.jsp";
	}
	
	@Execute(validator=false, urlPattern="tweet&page={page}")
	public String mytweet_paging() {
		TweetCB cb = getTweetCB(sessionDto.userId); 
		cb.paging(parpage_num, indexForm.page);
		PagingResultBean<Tweet> list = tweetBhv.selectPage(cb);
		PageRangeOption option = setPageRangeOption();
		list.setPageRangeOption(option);
		numberList = list.pageRange().createPageNumberList();
		this.tweetList = getTweetList(list);
		setCounter(sessionDto.userId);
		setMemberDto(sessionDto.userId);
		return "mytweet.jsp";
	}
	
	@Execute(validator=false, urlPattern="id={value}")
	public String memberpage() {
		if(indexForm.value == sessionDto.userId) {
			return "/tweet?redirect=true";
		}
		UserCB ucb = new UserCB();
		ucb.query().setId_Equal(indexForm.value);
		User user = userBhv.selectEntity(ucb);
		if(user == null) {
			return "/common/footer.jsp";
		}
		TweetCB cb = getTweetCB(indexForm.value);
		cb.paging(parpage_num, 1);
		PagingResultBean<Tweet> list = tweetBhv.selectPage(cb);
		PageRangeOption option = setPageRangeOption();
		list.setPageRangeOption(option);
		numberList = list.pageRange().createPageNumberList();
//		this.recordCount = list.getAllRecordCount();
//		this.pageCount = list.getAllPageCount();
		this.tweetList = getTweetList(list);
		setCounter(indexForm.value);
		setMemberDto(indexForm.value);
		return "mytweet.jsp";
	}
	
	@Execute(validator=false)
	public String dotweet() {
		Tweet tweet = new Tweet();
		tweet.setUserId(sessionDto.userId);
		tweet.setTweet(indexForm.tweetContent);
		tweetBhv.insert(tweet);
		return "index?redierct=true";
	}
	
	@Execute(validator=false)
	public String delete_tweet() {
		TweetCB cb = new TweetCB();
		cb.query().setId_Equal(indexForm.deleteTweetId);
		Tweet tweet = tweetBhv.selectEntity(cb);
		tweetBhv.delete(tweet);
		return "/?redirect=true";
	}
	
	@Execute(validator=false)
	public String dosearch() {
		String query = indexForm.query;
		return "search?q="+query+"?redirect=true";
	}
	
	@Execute(validator=false, urlPattern="search")
	public String search() {
		String query = indexForm.q;
		LikeSearchOption option = new LikeSearchOption();
		option.likeContain();
		TweetCB tcb = new TweetCB();
		tcb.query().setTweet_LikeSearch(query, option);
//		int tweetCount = tweetBhv.selectCount(tcb);
		UserCB ucb = new UserCB();
		ucb.query().setUsername_LikeSearch(query, option);
//		int userCount = userBhv.selectCount(ucb);
		return "searchquery.jsp";
	}
	
	@Execute(validator=false)
	public String unfollow() {
		RelationshipCB cb = new RelationshipCB();
		cb.query().setFollowId_Equal(sessionDto.userId);
		cb.query().setFollowedId_Equal(indexForm.relationId);
		Relationship ship = relationshipBhv.selectEntity(cb);
		relationshipBhv.delete(ship);
		return "following?redirect=true";
	}
	
	@Execute(validator=false)
	public String dofollow() {
		Relationship ship = new Relationship();
		ship.setFollowId(sessionDto.userId);
		ship.setFollowedId(indexForm.relationId);
		relationshipBhv.insert(ship);
		return "following?redirect=true";
	}
	
	private PageRangeOption setPageRangeOption() {
		PageRangeOption option = new PageRangeOption();
		option.setPageRangeSize(5);
		option.setFillLimit(true);
		return option;
	}
	
	private void setMemberDto(int id) {
		UserCB cb = new UserCB();
		cb.query().setId_Equal(id);
		User user = userBhv.selectEntity(cb);
		memberDto.memberId = user.getId();
		memberDto.memberName = user.getUsername();
		
	}
	
	private void setCounter(int id) {
		this.followingCount = userBhv.selectCount(getUserCB(sessionDto.userId, Following));
		this.followerCount = userBhv.selectCount(getUserCB(sessionDto.userId, Follower));
		this.myTweetCount = tweetBhv.selectCount(getTweetCB(sessionDto.userId));
		this.memberfollowingCount = userBhv.selectCount(getUserCB(id, Following));
		this.memberfollowerCount = userBhv.selectCount(getUserCB(id, Follower));
		this.memberTweetCount = tweetBhv.selectCount(getTweetCB(id));
	}
	
	private TweetCB getTweetCB(int id) {
		TweetCB cb = new TweetCB();
		cb.query().setUserId_Equal(id);
		cb.setupSelect_User();
		cb.query().addOrderBy_CreateAt_Desc();
		return cb;
	}
	
	private List<TweetDto> getTweetList(List<Tweet> list) {
		tweetList = new ArrayList<TweetDto>();
		for(Tweet tweet: list) {
			TweetDto tweetDto = new TweetDto();
			tweetDto.tweetId = tweet.getId();
			tweetDto.tweet =  tweet.getTweet();
			tweetDto.username = tweet.getUser().getUsername();
			tweetDto.userId = tweet.getUserId();
			tweetDto.create_at = tweet.getCreateAt();
			tweetList.add(tweetDto);
		}
		return tweetList;
	}
	
	private UserCB getUserCB(final int id, int cate) {
		UserCB cb = new UserCB();
		switch(cate) {
		case Follower:
			cb.query().existsRelationshipByFollowIdList(new SubQuery<RelationshipCB>() {
				public void query(RelationshipCB cb) {
					cb.query().setFollowedId_Equal(id);
				}
			});
			break;
		case Following:
			cb.query().existsRelationshipByFollowedIdList(new SubQuery<RelationshipCB>() {
				public void query(RelationshipCB cb) {
					cb.query().setFollowId_Equal(id);
				}	
			});
			break;
		}
		return cb;
	}
	
	private List<UserStatusDto> getUserList(List<User> list) {
		userList = new ArrayList<UserStatusDto>();
		for(User user: list) {
			UserStatusDto userStatusDto = new UserStatusDto();
			userStatusDto.id = user.getId();
			userStatusDto.name = user.getUsername();
			userStatusDto.Email = user.getEmail();
			RelationshipCB cb = new RelationshipCB();
			cb.query().setFollowId_Equal(sessionDto.userId);
			cb.query().setFollowedId_Equal(userStatusDto.id);
			if (relationshipBhv.selectEntity(cb) != null) {
				userStatusDto.relation = true;
			} else {
				userStatusDto.relation = false;
			}
			userList.add(userStatusDto);
		}
		return userList;
	}
}
