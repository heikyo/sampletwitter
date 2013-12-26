<%@page pageEncoding="UTF-8"%>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/twitter_sample/css/sample_twitter.css">
</head>
<body>
<div class="signup_containar">
	<div class="loginform">
		<s:form method="POST">
			mailadress:<html:text property="loginName"></html:text><br>
			password  :<html:text property="loginPass"></html:text><br>
			<s:submit property="login" value="submit"/>
		</s:form>
	</div>
	<div class="toregisterform">
		<s:form method="POST">
			<s:submit property="toregister" value="新規会員登録はこちら"></s:submit>
		</s:form>
	</div>
</div>
</body>
</html>