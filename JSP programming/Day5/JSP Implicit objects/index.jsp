<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		session.setAttribute("myName", "This is Atharv!");
	
	%>
	<form action="welcome">
		<input type="text" name="username">
		<button type="submit">OK</button>
	
	</form>
</body>
</html>
