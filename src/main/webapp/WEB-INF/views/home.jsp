<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page pageEncoding="UTF-8" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
	<c:forEach var = "m" items = "${list}">
		${m}<br>
	</c:forEach>
<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
