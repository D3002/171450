<%-- 
    Document   : signup
    Created on : Jul 2, 2023, 9:46:19 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign UP</title>
    </head>
    <body>
        <form action="SignUpServlet" method="post">
            Username<input type="text" name="username"></br>
            Password<input type="password" name="password"></br>
            Retype password<input type="password" name="repassword"></br>
            <button type="submit">Sign up</button></br>
        </form>
    </body>
</html>
