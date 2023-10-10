<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : discuss.jsp
    Created on : Oct 7, 2023, 11:44:35 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form action="discuss" method="post">
            <c:forEach var="thread" items="${lThread}">
                Thread: ${thread.thread}        
                <br/>
            </c:forEach>
        </form>
    </body>
</html>
