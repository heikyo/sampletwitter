<%@page pageEncoding="UTF-8"%>
<html>
<body>
<s:form method="POST">
	name:<html:text property="registerName"></html:text><br>
	pass:<html:text property="registerPass"></html:text><br>
	email:<html:text property="registerEmail"></html:text><br>
	<s:submit property="register" value="submit"/>
</s:form>


<s:form method="POST">
<s:submit property="tologin" value="アカウントを持っている"></s:submit>
</s:form>
</body>
</html>