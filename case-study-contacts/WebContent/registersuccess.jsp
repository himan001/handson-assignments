<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Successfully Registered</h3>
<p> Your Details are as follows : </p>
	<p>Id: ${userKey.userId}, Name : ${userKey.name}, Phone: ${userKey.phone}</p>
	<jsp:include page = "login.html"></jsp:include> 
</body>
</html>