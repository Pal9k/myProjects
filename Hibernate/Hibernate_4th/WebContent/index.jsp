<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.model.*" %>
<!DOCTYPE html>
<html>
<head>   
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%User u=(User)request.getAttribute("userdata");
if(u!=null){
%>
<form action="UserServlet" method="post">
		<input type="hidden" name="id" value="<%=u.getId() %>"/>
		Username:-<input type="text" name="username" value="<%=u.getUsername()%>"/><br>
		
		Password:-<input type="password" name="pass" value="<%=u.getPassword()%>"/><br>
		
		<input type="submit" name="submit" value="Update" />&nbsp;&nbsp;<input type="reset">
		
	</form>
<%}else{ %>

	<form action="UserServlet" method="post">
	
		Username:-<input type="text" name="username" /><br>
		
		Password:-<input type="password" name="pass" /><br>
		
		<input type="submit" name="submit" value="Register" />&nbsp;&nbsp;<input type="reset">
		
	</form>
	
	<%} %>

</body>
</html>