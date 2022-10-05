<%-- 
    Document   : index
    Created on : 3 Oct, 2022, 4:36:16 PM
    Author     : Mahin Sojitra
    Defination : Demonstrate Core tags.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index | Demonstrate Core tags</title>
    </head>
    <body>
        <!-- for declaring variable --> 
        <c:set var="age" value="18" />
        
        <!-- for print value of any variable --> 
        <h3>Age : <c:out value="${age}" /></h3>
        
        <!-- conditional tag(if) --> 
        <c:if test="${age>=18}">
            <p> You are eligible for Voting </p> 
        </c:if>
            
        <!-- foreach loop -->    
        <c:forEach begin="1" end="10" var="i">
            <c:out value="${i}" />
        </c:forEach>
        
        <!-- for removing variable from memory --> 
        <c:remove var="age"></c:remove>
        
        <!-- redirect tag -->
        <c:redirect url="https://www.google.com/search?q=kenil+vastarpara" />
    </body>
</html>