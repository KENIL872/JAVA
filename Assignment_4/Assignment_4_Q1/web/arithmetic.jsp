<%-- 
    Document   : arithmetic
    Created on : 2 Oct, 2022, 1:47:07 PM
    Author     : Mahin Sojitra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Operation</title>
    </head>
    <body>
        <%
            int a = Integer.parseInt(request.getParameter("val1")); 
            int b = Integer.parseInt(request.getParameter("val2")); 
        %>
        <h1> Addition : <%= a + b %></h1>
        <h1> Subtraction : <%= a - b %></h1>
        <h1> Division : <%= (double)a / b %></h1>
        <h1> Multiplication : <%= a * b %></h1>
    </body>
</html>
