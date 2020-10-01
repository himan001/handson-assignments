<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<h4>Welcome,  ${userKey.name}</h4>
	<button onclick="document.location='update.html'">Update Profile</button>
	<br/>
	<br/>	
	<button onclick="document.location='addcontacts.html'">Add Contacts</button>
	<br/>
	<br/>	
		<form action = "Display" method = "get">
		<button>View all contacts</button>
	</form>
	<br/>

	<button onclick="document.location='editcontacts.html'">Edit contacts</button>
	<br/>
	<br/>
	<button onclick="document.location='deletecontacts.html'">Delete contacts</button>
	<br/>
	<br/>
	<form action = "DeleteProfile" method = "get">
		<button>Delete My Profile</button>
	</form>
	<br/>

		<form action = "Logout" method = "get">
		<button>Logout</button>
	</form>
</body>
</html>