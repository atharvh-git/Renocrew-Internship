<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Taglib Directive Example</h1>
	<c:set var="name" value="Be coder"></c:set>
	<c:out value="${name}"></c:out>
	
	<c:if test="${3>2}">
		<h1>True Block</h1>
	</c:if>
</body>
</html>
