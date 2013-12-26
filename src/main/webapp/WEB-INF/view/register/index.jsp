<%@page pageEncoding="UTF-8"%>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/twitter_sample/css/sample_twitter.css">
</head>
<body>
<div class="signup_containar">
	<div class="registerform">
		<s:form method="POST">
			username:<html:text property="registerName"></html:text><br>
			password:<html:text property="registerPass"></html:text><br>
			email   :<html:text property="registerEmail"></html:text><br>
		<s:submit property="register" value="submit"/>
	</s:form>
	</div>
	<div class="tologinform">
		<s:form method="POST">
			<s:submit property="tologin" value="アカウントを持っている"></s:submit>
		</s:form>
	</div>
</div>
</body>
</html>