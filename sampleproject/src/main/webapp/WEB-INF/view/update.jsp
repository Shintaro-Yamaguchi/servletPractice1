<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
    <meta charset="utf-8">
    <title>データ更新</title>
    <meta name="description" content="データ更新">
  </head>
</head>
<body>
	<h1>データ更新</h1>

	<% ArrayList<Integer> id = (ArrayList<Integer>) request.getAttribute("id"); %>
	<% ArrayList<String> username = (ArrayList<String>) request.getAttribute("username"); %>
	<% ArrayList<Integer> gender = (ArrayList<Integer>) request.getAttribute("gender"); %>
	<% ArrayList<String> message = (ArrayList<String>) request.getAttribute("message"); %>
	
	<%= out.println(id) %>
	
	
</body>
</html>