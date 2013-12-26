<%@page pageEncoding="UTF-8"%>
<html>
<body>
mytweet.jsp<br>

following: <s:link href="following">${followingCount}</s:link>
follower: <s:link href="follower">${followerCount}</s:link>
mytweet: <s:link href="mytweet">${myTweetCount}</s:link>

<ul>
<c:forEach var="tweet" varStatus="s" items="${tweetList}">
	<li>${tweet.tweet}</li>
</c:forEach>
</ul>
</body>
</html>