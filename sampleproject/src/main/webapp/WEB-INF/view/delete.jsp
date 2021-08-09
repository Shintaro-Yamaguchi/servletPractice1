<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.util.ArrayList" %>
<%@ page import = "java.util.List" %>
<!DOCTYPE html>
<html>
	<head>
    <meta charset="utf-8">
    <title>データ削除</title>
    <meta name="description" content="データ削除">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/sampleStyle.css">
  </head>
</head>
<body>
	<h1>データ削除</h1>
	
	<h2>以下のデータを削除しますか。</h2>
	
	<form name="contact-form" method="post" action="deletecontact" class="contact-form">
      <dl>
      	<dt>登録No.</dt>
      	<dd><input type="text" name="id" value="<%= request.getAttribute("id") %>" readonly></dd>
        <dt>名前</dt>
        <dd><input type="text" name="username" value="<%= request.getAttribute("username") %>" readonly></dd>
        <dt>性別</dt>
        <dd><input type="text" name="username" value="<%= request.getAttribute("gender") %>" readonly></dd>
        <dt>問合内容</dt>
        <dd><textarea name="message" class="message" readonly><%= request.getAttribute("message") %></textarea></dd>
        <dt>添付ファイル</dt>
        <dd><input type="file" name="file" class="file" readonly></dd>
      </dl>
      <div>
        <input type="submit" value="削除" class="send">
      </div>
    </form>
	
	
</body>
</html>