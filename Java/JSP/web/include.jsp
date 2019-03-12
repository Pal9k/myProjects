<%-- 
    Document   : middle
    Created on : 14 Feb, 2019, 9:42:29 PM
    Author     : palat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            h1{
                align-content: center;
                vertical-align: center;
            }
            
            .middle{
                background: pink;
                width: 80%;
                margin: 20px 10% 20px 10%;
                height: 300px;
                align-content: center;
            }
        </style>
    </head>
    <body>
        
        <%@include file="header.jsp" %>
        
        <div class="middle">
            <h1>Middle!!!</h1>
        </div>
        
        <%@include file="footer.jsp" %>
    </body>
</html>
