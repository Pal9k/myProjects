<%-- 
    Document   : func
    Created on : 21 Feb, 2019, 9:15:49 PM
    Author     : palat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:set var = "theString" value = "I am a string"/>
        <c:if test="${fn:contains(theString,'test')}">
            <p>Found test string</p>
        </c:if>
        <c:if test="${fn:endsWith(theString,'t')}">
            <p>Not End with t</p>
        </c:if>  
        <c:if test="${fn:indexOf(theString,'t')}">
            <p>Not End with t</p>
        </c:if>
        <p>The index of t is ${fn:indexOf(theString,'t')}</p>
        <p>Replacing string with integer ${fn:replace(theString,'string','integer')} </p>
        <p>Functions is starts with ${fn:startsWith(theString,'I')} </p>
        <p>${fn:toLowerCase(thString)}</p>
        <p>${fn:toUpperCase(theString)}</p>
        <p>${fn:split(theString, 'am')}</p>
        <p>${fn:trim(theString)}</p>
        
    </body>
</html>
