<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

</head>
<body>
	<div class="container">
		<table class="table">
			<thead>
				<tr>
					<th scope="col">BookId</th>
					<th scope="col">BookName</th>
					<th scope="col">Cost</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="book" items="${sessionScope.Book}">
			<c:if test="${book.bookId gt 20}">
				<tr>
					<td>${book.bookId}</td>
					<td>${book.bookName}</td>
					<td>${book.cost}</td>
				</tr>
				</c:if>
				</c:forEach>
			</tbody>
		</table>
		<c:forEach var="entry" items="${sessionScope.pub}">
		<c:forEach var="list" items="${entry.value}">
				<br/>
				${list.bookId}:${list.bookName}:${list.cost}
				</c:forEach>
				</c:forEach>
				<br/>
		<c:out value="made by Shail Mishra"></c:out>
	</div>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>