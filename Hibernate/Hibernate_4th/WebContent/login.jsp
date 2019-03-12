<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="UserServlet" method="post">
	
		Username: <input type="text" name="username">
		
		Password: <input type="text" name="pass">
	
		<input type="submit" name="submit" value="login">
		
	</form>


</body>
</html>