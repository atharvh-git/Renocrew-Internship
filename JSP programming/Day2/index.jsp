<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      
 <%@page import="java.util.*" %>  
 <%@ page session="false" %> 
 <%@ page isELIgnored="false" %> 
 <%@ page errorPage="error.jsp" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <%@include file="header.jsp" %>
  <h1><%=new Date().toString() %></h1>
</body>
</html>
