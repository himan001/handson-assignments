<%@ page import = "com.hsbc.model.beans.User" %>
<%@ page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>User List</h2>
  <table border="1px solid black" style="border-collapse: collapse;">
	<tr>
		<th>Id</th>
		<th>User Name</th>
		<th>Phone</th>
	</tr>
	   <% 
      List<User> userList = (List<User>)session.getAttribute("userKey");
      
      for(User user : userList){
    	  
    	  out.println("<tr><td>"+user.getUserId()+"</td><td>"+user.getName()+"</td><td>"+user.getPhone()+"</td></tr>");
      }
    	  
    	%>
</table>
</body>
</html>