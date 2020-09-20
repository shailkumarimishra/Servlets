<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Your submitted data</h1>
<p>${requestScope.username}</p>
<p>${requestScope.password}</p>
<p>${requestScope.email}</p>
<p>${requestScope.phone}</p>
<p>${requestScope.dob}</p>
<p>${requestScope.gender}</p>
<c:forEach items="${requestScope.courses}" var="course">
<p>${course}</p>
</c:forEach>
<p>${requestScope.state}</p>
<p>${requestScope.remark}</p>
</body>
</html>