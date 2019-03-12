<%-- 
    Document   : calculator_action
    Created on : 14 Feb, 2019, 8:59:09 PM
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
        <% String str = request.getParameter("operation"); %>
        <h1>Result for <%=str%>
        </h1>
        
            <%
                int n1 = Integer.parseInt(request.getParameter("n1"));
                int n2 = Integer.parseInt(request.getParameter("n2"));
                int ans=0;
                if(str.equals("Addition")){
                    ans = n1+n2;
                }
                if(str.equals("Subtraction")){
                    ans = n1-n2;
                }
                if(str.equals("Multiplication")){
                    ans = n1*n2;
                }
                if(str.equals("Devision")){
                    ans = n1/n2;
                }
            %>
            
            <%=ans%>
            
    </body>
</html>
