<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Good Morning!</title>
</head>
<body>
	<h1><%= request.getAttribute("morning") %></h1>
	<h1><%= request.getAttribute("number") %></h1>
	<a href="http://localhost:8080/sampleproject/servlet/hello">リンク</a>
</body>
</html>