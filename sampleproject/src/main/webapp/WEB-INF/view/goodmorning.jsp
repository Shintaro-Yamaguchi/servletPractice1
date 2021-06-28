<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.util.ArrayList" %>
<%@ page import = "java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Good Morning!</title>
</head>
<body>
	<h1><%= request.getAttribute("morning") %></h1>
	<% ArrayList<String> id = (ArrayList<String>) request.getAttribute("id"); %>
	<% for(int i=0; i<id.size(); i++){ %>
          <%= id.get(i) %><br/>
    <% } %>
    
	<% ArrayList<String> item = (ArrayList<String>) request.getAttribute("item"); %>
	<% for(int i=0; i<item.size(); i++){ %>
          <%= item.get(i) %><br/>
    <% } %>
    
	<% ArrayList<Integer> price = (ArrayList<Integer>) request.getAttribute("price"); %>
	<% for(int i=0; i<price.size(); i++){ %>
          <%= price.get(i) %><br/>
    <% } %>
    
	<h1><%= request.getAttribute("number") %></h1>
	<a href="http://localhost:8080/sampleproject/servlet/hello">リンク</a>
</body>
</html>