<div class="topbar">
	<div id="containar">
		<div class="home">sampletwitter</div>
		<html:link styleClass="logout" href="/twitter_sample/logout">ログアウト</html:link>
		<s:form  styleClass="searchform" method="POST">
			<html:text styleClass="inputtext" property="query"></html:text>
			<s:submit property="dosearch" value="search"/>
		</s:form>
	</div>
</div>
