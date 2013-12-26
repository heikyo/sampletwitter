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
									<s:form method="POST">
										<html:hidden property="deleteTweetId" value="${tweet.tweetId }"/>
										<s:submit property="delete_tweet" value="削除"/>
									</s:form>
								</c:if>
							</div>
						</li>
					</ul>
				</div>
				</c:forEach>
			</div>
			<div class="paging">
				<c:forEach var="page" items="${numberList }">
					<s:link styleClass="page" href="/?page=${page}">${page}</s:link>
				</c:forEach>
			</div>
		</div>
	</div>
</div>
</tiles:put>
</tiles:insert>