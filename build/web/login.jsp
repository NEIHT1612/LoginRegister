<%-- 
    Document   : login.jsp
    Created on : Oct 7, 2023, 9:00:53 PM
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
        <form action="login?value=login" method="post">
            Username: <input type="text" name="username" required/>
            <br/>
            Password: <input type="password" name="password" required/>
            <br/>
            <input type="submit" value="Login"/>        
            <button onclick="document.location='register.jsp'">Register</button>
            <input type="reset" value="Reset"/>
        </form>
        <p>${error}</p>
    </body>
</html>
