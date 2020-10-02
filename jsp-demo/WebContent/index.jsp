<%@ page import ="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Insert Title here</h2>
	<h2>Addition: ${10+20} </h2>
	<%@include file = "simple.txt" %>
	<%!
		int i = 10;
	%>
	<%
		int j=10;
		Date date = new Date();
		j++;
		i++;
	%>
	<h3>Value of i : <%=i %></h3>
	<h3> Value of i in EL: ${i}</h3>
	<h3>Value of j : <%=j %></h3>
	<h3>Value of Date : <%=date %></h3>
	
	<form>
	</form>
</body>
</html>