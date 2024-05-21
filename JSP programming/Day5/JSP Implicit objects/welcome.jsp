<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	
	<% String nm = (String) session.getAttribute("myName");
	    out.print(nm);
	
	%>
	
	<a href="next.jsp">Remove Session</a>
	
	<%--
		<% 
		String name = application.getInitParameter("username");
		out.println(name);
	
	%>
	 --%>
	
</body>
</html>
