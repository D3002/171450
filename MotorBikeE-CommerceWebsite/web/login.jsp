<%-- 
    Document   : login
    Created on : Jun 28, 2023, 8:02:12 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Html.html to edit this template
-->

<html>
    <style>
        body {
            font-family: Arial, Helvetica, sans-serif;
        }
        form {
            border: 3px solid #f1f1f1;
        }

        input[type=text], input[type=password] {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            box-sizing: border-box;
        }

        button {
            background-color: #04AA6D;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            cursor: pointer;
            width: 100%;
        }

        button:hover {
            opacity: 0.8;
        }

        .cancelbutton {
            width: auto;
            padding: 10px 18px;
            background-color: #f44336;
        }

        .container {
            padding: 16px;
        }

        span.psw {
            float: right;
            padding-top: 16px;
        }

        /* Change styles for span and cancel button
        on extra small screens */
        @media screen and (max-width: 300px) {
            span.psw {
                display: block;
                float: none;
            }
            .cancelbutton {
                width: 100%;
            }
        }
    </style>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Login Application</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">

    </head>
</head>
<body>

    <form action="loginServlet" method="post" onclick="ValidateEmail(document.getElementById('emailId'))">
        <div class="container">
            <label for="username"><b>Username</b></label></br>
            <input type="text" placeholder="Please enter your user name" name="user" id = "emailId" required></br>

            <label for="password"><b>Password</b></label></br>
            <input type="password" placeholder="Please enter Password" name="pass" id="password" required></br>

            <button type="submit">Login</button></br>
            <label>
                <input type="checkbox" checked="checked" name="rememberme"> Remember me
            </label>
        </div>

        <div class="container" style="background-color:#f1f1f1">
            <button type="button" class="cancelbutton">Cancel</button>
        </div>
    </form>
</body>
</html>

