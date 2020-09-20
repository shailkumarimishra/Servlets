<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="test.do" method="post">
<div>
<label for="username">Username</label>
<input type="text" name="username">
</div>
<div>
<label for="password">Password</label>
<input type="password" name="password">
</div>
<div>
<label for="email">Email</label>
<input type="email" name="email">
</div>
<div>
<label for="phoneno">Phone no</label>
<input type="number" name="phoneno">
</div>
<div>
<label for="dob">DOB</label>
<input type="date" name="dob">
</div>
<div>
<label for="gender">Gender</label>
<input type="radio" name="gender" value="male">Male
<input type="radio" name="gender" value="female">Female
</div>
<div>
<label for="course">Course</label>
<input type="checkbox" name="course" value="Java">Java
<input type="checkbox" name="course" value="JSP">JSP
<input type="checkbox" name="course" value="Servlet">Servlet
</div>
<div>
<label for="state">Select State</label>
<select name="state">
<option value="Bihar">Bihar</option>
<option value="MP">MP</option>
<option value="UP">UP</option>
<option value="Gujrat">Gujrat</option>
</select>
</div>
<div>
<label for="remark">Remark</label>
<textarea rows="4" cols="20" name="remark"></textarea>
</div>
<div>
<button type="submit">Submit</button>
</div>
</form>
<div>
<a href="link.do">login</a>
</div>

</body>
</html>



