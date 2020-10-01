<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<title>Contacts</title>
</head>
<body>
<h2>Contact List</h2>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "core" %>
	<table class="table table-striped">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Phone Number</th>
	</tr>
		<core:forEach items="${contactListKey}" var="c">
			<tr><td>${c.contactId}</td><td>${c.name}</td><td>${c.phoneNo}</td></tr>
		</core:forEach>
	</table>
	<br />
	<br />
	<button onclick="document.location='loginsuccess.jsp'">Home Page</button>
</body>
</html>