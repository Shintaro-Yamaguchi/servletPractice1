<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.util.ArrayList" %>
<%@ page import = "java.util.List" %>
<!DOCTYPE html>
<html>
	<head>
    <meta charset="utf-8">
    <title>データ更新</title>
    <meta name="description" content="データ更新">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/sampleStyle.css">
  </head>
</head>
<body>
	<h1>データ更新</h1>
	
	<%= request.getAttribute("id") %>
	<%= request.getAttribute("username") %>
	<%= request.getAttribute("gender") %>
	<%= request.getAttribute("message") %>
	
	<form name="contact-form" method="post" action="updatecontact" class="contact-form">
      <dl>
      	<dt>登録No. <%= request.getAttribute("id") %></dt><br>
        <dt>名前</dt>
        <dd><input type="text" name="username" value="<%= request.getAttribute("username") %>"></dd>
        <dt>性別</dt>
        <dd>
	        <input type="radio" name="gender" value="0">男性
	        <input type="radio" name="gender" value="1">女性
        </dd>
        <dt>問合内容</dt>
        <dd><textarea name="message" class="message"><%= request.getAttribute("message") %></textarea></dd>
        <dt>添付ファイル</dt>
        <dd><input type="file" name="file" class="file"></dd>
      </dl>
      <div>
        <input type="submit" value="更新" class="send">
      </div>
    </form>
	
	
</body>
</html>