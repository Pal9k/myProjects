<%-- 
    Document   : calculator
    Created on : 14 Feb, 2019, 8:48:25 PM
    Author     : palat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Calculator!</h1>
        <form action="calculator_action.jsp">
            First number: <input type="text" name="n1"><br>
            Last number: <input type="text" name="n2"><br>
            <input type="radio" name="operation" value="Addition" checked> Addition<br>
            <input type="radio" name="operation" value="Subtraction"> Subtraction<br>
            <input type="radio" name="operation" value="Multiplication"> Multiplication<br>
            <input type="radio" name="operation" value="Devision"> Devision<br>
            <input type="submit" value="Submit">
         </form>
    </body>
</html>
