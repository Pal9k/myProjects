<%@page import="com.controller.UserController"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="java.util.List"%>
	<%@page import="com.model.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%List<User> userList=UserController.getAll();%>
	
	<table>
		<tr>
			<td>ID</td>
			<td>Username</td>
			<td>Password</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		
		<%for(User u:userList){ %>
	
		<tr>
			<td><%=u.getId() %></td>
			<td><%=u.getUsername() %></td>
			<td><%=u.getPassword() %></td>
			<td><form action="UserServlet" method="post">
			<input type="hidden" name="id" value="<%=u.getId() %>"/>
			<input type="submit" name="submit" value="Edit">
			</form>
			</td>
			<td><form action="UserServlet" method="post">
			<input type="hidden" name="id" value="<%=u.getId() %>"/>
			<input type="submit" name="submit" value="Delete">
			</form>
			</td>
		</tr>

	<% } %>

	</table>

</body>
</html>