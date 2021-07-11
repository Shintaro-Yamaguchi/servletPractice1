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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/get_contact.css">
  </head>
<body>
	<h1>Hello</h1>
    
    <table>
	    <tr>
	    	<th>No.</th>
	    	<th>名前</th>
	    	<th>性別</th>
	    	<th>問合内容</th>
	    	<th>更新</th>
	    	<th>削除</th>
	    </tr>
	    <% ArrayList<Integer> id = (ArrayList<Integer>) request.getAttribute("id"); %>
		<% ArrayList<String> username = (ArrayList<String>) request.getAttribute("username"); %>
		<% ArrayList<Integer> gender = (ArrayList<Integer>) request.getAttribute("gender"); %>
		<% ArrayList<String> message = (ArrayList<String>) request.getAttribute("message"); %>
		<% for(int i=0; i<id.size(); i++){ %>
			<% out.println("<tr>"); %>
			<% out.println("<td>"); %>
	          <%= id.get(i) %>
			<% out.println("</td>"); %>
			
			<% out.println("<td>"); %>
	          <%= username.get(i) %>
	        <% out.println("</td>"); %>
	        
	        <% out.println("<td>"); %>
	          <%= gender.get(i) %>
	        <% out.println("</td>"); %>
	        
	        <% out.println("<td>"); %>
	          <%= message.get(i) %>
	        <% out.println("</td>"); %>
	        
	        <% out.println("<td>"); %>
	        <% out.println("<form name=update method=post action=update class=update>"); %>
	        <% out.println("<input type=hidden name=id value="+id.get(i)+">"); %>
	        <% out.println("<input type=hidden name=username value="+username.get(i)+">"); %>
	        <% out.println("<input type=hidden name=gender value="+gender.get(i)+">"); %>
	        <% out.println("<input type=hidden name=message value="+message.get(i)+">"); %>
	        <% out.println("<input type=submit value=更新>"); %>
	        <% out.println("</form>"); %>
	        <% out.println("</td>"); %>
	        
	        <% out.println("<td>"); %>
	        <% out.println("<button type=reset name=name value=#>削除"); %>
	        <% out.println("</button>"); %>
	        <% out.println("</td>"); %>
	        
			<% out.println("</tr>"); %>
			
			
	    <% } %>
    </table>
	
</body>
</html>