<%-- 
    Document   : welcome
    Created on : May 31, 2023, 9:07:59 AM
    Author     : asus
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<style>
    .welcome{
        justify-content: center;
        text-align: center;
        background: #00cc66;
        color: white;
    }
</style>
<html>
    <head>
    </head>
    <body>
        <h1 class="welcome">Welcome <%=session.getAttribute("username") %></h1>
    </body>
</html>