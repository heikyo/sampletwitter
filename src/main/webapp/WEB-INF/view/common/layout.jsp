<html>
<head>
<title><tiles:getAsString name="title" /></title>
<link rel="stylesheet" type="text/css" href="${f:url('/css/sample_twitter.css')}">
<script type="text/javascript" src="${f:url('/js/sample_twitter.js')}"></script>
<script type="text/javascript" src="${f:url('/js/jquery.js')}">></script>
</head>
<body>

<tiles:insert page="/WEB-INF/view/common/header.jsp" />

<tiles:insert attribute="content" />
<%-- <tiles:insert page="/WEB-INF/view/common/footer.jsp" /> --%>
</body>
</html>