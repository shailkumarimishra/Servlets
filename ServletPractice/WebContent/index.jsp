<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Home page</h1>
<h2>Total visited:<%=application.getAttribute("TV")%></h2><br>
<h2>Total active:<%=application.getAttribute("TA")%></h2><br>
<br>
<a href="logout.do">Logout</a>
<%
int a=10/2;
%>
</body>
</html>