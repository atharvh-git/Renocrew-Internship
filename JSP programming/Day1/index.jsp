<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>Declaration Tag:</h1>
 <% int a = 10; String name = "becoder"; %>
 
 <h1>Expression Tag:   <%= a %> <%= name %></h1>
 
 <h1>Scriplet Tag:</h1>
 <%
 	int sum = 20+20;
 	out.println("Sum: " + sum);
 	int sub = sum - 10;
 	out.println("sub: " + sub);
 
 %>
</body>
</html>
