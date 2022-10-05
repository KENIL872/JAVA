<%-- 
    Document   : error
    Created on : 2 Oct, 2022, 2:20:35 PM
    Author     : Mahin Sojitra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error | <%= exception.getMessage() %></title>
    </head>
    <body>
        <h1 style="color: red;">
            Error : <%= exception.getMessage() %>
        </h1>
    </body>
</html>
