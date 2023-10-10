<%-- 
    Document   : register
    Created on : Oct 7, 2023, 9:44:13 PM
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
        <form action="login?value=register" method="post">
            Username: <input type="text" name="username" required/>
            <br/>
            Password: <input type="password" name="password" required/>
            <br/>
            DisplayName: <input type="text" name="nickname" required/>
            <br/>
            <input type="submit" value="Register"/>     
            <button onclick="document.location='login.jsp'">Login</button>
            <input type="reset" value="Reset"/>
        </form>
        <p>${error}</p>
    </body>
</html>
