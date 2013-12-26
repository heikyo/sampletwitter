<%@page pageEncoding="UTF-8"%>
<tiles:insert template="/WEB-INF/view/common/layout.jsp" flush="true">
<tiles:put name="title" value="twitter"/>
<tiles:put name="content" type="string">

<div class="main">
<div id="containar">
<div class="userdatabox">
	<div class="username">
		<s:link href="/">${sessionDto.username }</s:link>
	</div>
	<div>
		follow: <s:link href="following">${followingCount}</s:link>
		follower: <s:link href="follower">${followerCount}</s:link>
		tweet: <s:link href="tweet">${myTweetCount}</s:link>
	</div>

	<s:form method="POST">
		<html:textarea property="tweetContent" cols="40" rows="4" onkeyup="ShowLength(value);"></html:textarea><br>
		<s:submit property="dotweet" value="submit"/>
	</s:form>
	<p id="inputlength">0文字</p>
</div>


<div class="mainbox">
	<div class="memberbox">
		<div class="membername">
			${memberDto.memberName }
		</div>
		<div class="memberdata">
			follow: <s:link href="/id=${memberDto.memberId}/following">${memberfollowingCount}</s:link>
			follower: <s:link href="/id=${memberDto.memberId}/follower">${memberfollowerCount}</s:link>
			tweet: <s:link href="/id=${memberDto.memberId}/">${memberTweetCount}</s:link>
		</div>
	</div>
	<div class="listbox">
	<div class="listbox_header">
		<p>ツイート</p>
	</div>
	<c:forEach var="tweet" varStatus="s" items="${tweetList}">
		<div id="tweetbox">
			<ul>
			<li>
				<div id="tweet">
			 		<s:link styleClass="username" href="id=${tweet.userid}">${tweet.username}</s:link>
					<p id="tweet_content">${tweet.tweet}</>
					<p id="tweet_timestamp">${tweet.create_at}</>
					<c:if test="${tweet.userId == sessionDto.userId}">
					<div class="delete_tweet">
						<s:form method="POST">
							<html:hidden property="relationId" value="${user.id }"/>
							<s:submit property="delete_tweet" value="削除"/>
						</s:form>
					</div>
					</c:if>
					
				</div>
			</li>
			</ul>
		</div>
	</c:forEach>
	</div>
	<c:forEach var="page" items="${numberList}">
			<c:choose> 
				<c:when test="${ sessionDto.userId==memberDto.memberId}">
					<s:link styleClass="page" href="/tweet&page=${page}">${page}</s:link>
				</c:when>
				<c:when test="${ sessionDto.userId!=memberDto.memberId}">
					<s:link styleClass="page" href="id=${memberDto.memberId }/tweet&page=${page}">${page}</s:link>
				</c:when>
			</c:choose>
		</c:forEach>
</div>

</div>
</div>
</tiles:put>
</tiles:insert>