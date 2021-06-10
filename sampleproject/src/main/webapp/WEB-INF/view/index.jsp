<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello World!</title>
</head>
<body>
	<h1><%= request.getAttribute("hello") %></h1>
	<a href="http://localhost:8080/sampleproject/servlet/morning">リンク</a>
	<form method="get" name=form1 action="morning">
		<input type="text" name="num"> <input type="submit"value="送信">
	</form>
</body>
</html>