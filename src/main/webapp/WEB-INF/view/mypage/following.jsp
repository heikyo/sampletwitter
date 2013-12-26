<%@page pageEncoding="UTF-8"%>
<html>
<body>
following.jsp<br>


following: <s:link href="following">${followingCount}</s:link>
follower: <s:link href="follower">${followerCount}</s:link>
mytweet: <s:link href="mytweet">${myTweetCount}</s:link>

<ul>
<c:forEach var="user" varStatus="s" items="${userList}">
	<li>${user}</li>
</c:forEach>
</ul>
</body>
</html>