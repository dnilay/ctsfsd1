<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

League added successfully<br/>

League Title:${league.title}<br/>
League Season:${league.season }</br>
League Year:${league.year}<br/>
<a href="${pageContext.request.contextPath}/">home</a>
</body>
</html>