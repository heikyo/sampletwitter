<%@page pageEncoding="UTF-8"%>
<html>
<body>
mypage.jsp<br>
${id }
following: <s:link href="following">${followingCount}</s:link>
follower: <s:link href="follower">${followerCount}</s:link>
mytweet: <s:link href="mytweet">${myTweetCount}</s:link>

<s:form method="POST">
	<html:text property="content"></html:text><br>
	<s:submit property="dotweet" value="submit"/>
</s:form>

<ul>
<c:forEach var="tweet" varStatus="s" items="${userList}">
	<li>${tweet}  ${tweet}</li>
</c:forEach>
</ul>
___________________________________
<ul>
<c:forEach var="tweet" varStatus="s" items="${tweetList}">
	<li>${tweet.tweet}  ${tweet.username}</li>
</c:forEach>
</ul>

_______________________________________
<ul>
<c:forEach var="tweet" varStatus="s" items="${shipList}">
	<li>${tweet}  ${tweet}</li>
</c:forEach>
</ul>

</body>
</html>