<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
				<tr>
					<td>${sessionScope.Book[0].bookId}</td>
					<td>${sessionScope.Book[0].bookName}</td>
					<td>${sessionScope.Book[0].cost}</td>
				</tr>
				<tr>
					<td>${sessionScope.Book[1].bookId}</td>
					<td>${sessionScope.Book[1].bookName}</td>
					<td>${sessionScope.Book[1].cost}</td>
				</tr>
				<tr>
					<td>${sessionScope.Book[2].bookId}</td>
					<td>${sessionScope.Book[2].bookName}</td>
					<td>${sessionScope.Book[2].cost}</td>
				</tr>
				<tr>
					<td>${sessionScope.Book[3].bookId}</td>
					<td>${sessionScope.Book[3].bookName}</td>
					<td>${sessionScope.Book[3].cost}</td>
				</tr>
				<tr>
					<td>${sessionScope.Book[4].bookId}</td>
					<td>${sessionScope.Book[4].bookName}</td>
					<td>${sessionScope.Book[4].cost}</td>
				</tr>
			</tbody>
		</table>
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