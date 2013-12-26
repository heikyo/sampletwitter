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
			<p>following</p>
		</div>	
		<c:forEach var="user" varStatus="s" items="${userList}">
		<div id="userbox">
		<ul>
			<li>
				<s:link href="id=${f:u(user.id)}">${user.name}</s:link>
				<s:form method="POST">
					<html:hidden property="relationId" value="${user.id }"/>
					<c:choose>
						<c:when test="${user.id == sessionDto.userId}">
							<s:submit property="index" value="マイページ"></s:submit>
						</c:when>
						<c:when test="${user.relation}">
							<s:submit property="unfollow" value="フォロー解除"></s:submit>
						</c:when>
						<c:when test="${!user.relation}">
							<s:submit property="dofollow" value="フォローする"></s:submit>
						</c:when>
					</c:choose>
				</s:form>
			</li>
		</ul>
		</div>
		</c:forEach>
	</div>
	<div class="paging">
		<c:forEach var="page" items="${numberList}">
			<c:choose> 
				<c:when test="${ sessionDto.userId==memberDto.memberId}">
					<s:link styleClass="page" href="/following&page=${page}">${page}</s:link>
				</c:when>
				<c:when test="${ sessionDto.userId!=memberDto.memberId}">
					<s:link styleClass="page" href="id=${memberDto.memberId }/following&page=${page}">${page}</s:link>
				</c:when>
			</c:choose>
		</c:forEach>
	</div>
</div>
</div>
</div>
</tiles:put>
</tiles:insert>