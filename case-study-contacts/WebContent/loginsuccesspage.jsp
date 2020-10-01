<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4> Your Details : - </h4>
	<p>Id: ${userKey.userId}, Name : ${userKey.name}, Phone: ${userKey.phone}</p>
	<jsp:include page="loginsuccess.jsp"></jsp:include>
</body>
</html>