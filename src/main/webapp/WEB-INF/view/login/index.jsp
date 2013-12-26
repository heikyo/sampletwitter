<%@page pageEncoding="UTF-8"%>
<html>
<body>
<s:form method="POST">
	name:<html:text property="loginName"></html:text><br>
	pass:<html:text property="loginPass"></html:text><br>
	<s:submit property="login" value="submit"/>
</s:form>
<s:form method="POST">
<s:submit property="toregister" value="新規会員登録はこちら"></s:submit>
</s:form>
</body>
</html>