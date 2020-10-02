<%@ page import = "com.hsbc.controller.User" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>User Display Page</h3>
	<h4 style = "color:blue" >Hello ${userKey.username}, your phone Number id ${userKey.phone}</h4>
	<hr />
	<h3>Another way to display is using Java Code</h3>
	<%
	User user = (User) session.getAttribute("userKey");
	%>
	<h4>Hello , <%= user.getUsername() %>, your phone number is <%= user.getPhone() %></h4>
	
</body>
</html>