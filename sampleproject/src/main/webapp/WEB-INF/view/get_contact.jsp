<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.util.ArrayList" %>
<%@ page import = "java.util.List" %>
<!DOCTYPE html>
<html lang="ja">
  <head>
    <meta charset="utf-8">
    <title>データベース取得内容</title>
    <meta name="description" content="データベース取得内容">
  </head>
<body>
	<h1>Hello</h1>
    
    <% ArrayList<Integer> id = (ArrayList<Integer>) request.getAttribute("id"); %>
	<% for(int i=0; i<id.size(); i++){ %>
          <%= id.get(i) %><br/>
    <% } %>
    
	<% ArrayList<String> username = (ArrayList<String>) request.getAttribute("username"); %>
	<% for(int i=0; i<username.size(); i++){ %>
          <%= username.get(i) %><br/>
    <% } %>
    
	<% ArrayList<Integer> gender = (ArrayList<Integer>) request.getAttribute("gender"); %>
	<% for(int i=0; i<gender.size(); i++){ %>
          <%= gender.get(i) %><br/>
    <% } %>
    
	<% ArrayList<String> message = (ArrayList<String>) request.getAttribute("message"); %>
	<% for(int i=0; i<message.size(); i++){ %>
          <%= message.get(i) %><br/>
    <% } %>
    
	
</body>
</html>