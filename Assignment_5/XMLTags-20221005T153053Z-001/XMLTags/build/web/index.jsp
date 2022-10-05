<%-- 
    Document   : index
    Created on : 4 Oct, 2022, 5:21:19 PM
    Author     : Mahin Sojitra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!--import xml file--> 
        <c:import var="doc" url="WEB-INF/students.xml" />
    
        <!--parsh above xml-->
        <x:parse doc="${doc}" var="output" />
        
        <!--select tags data from parsed XML-->
        <table border="2" cellpadding="5" cellspacing="4">
            <tr>
                <th>Roll No.</th>
                <th>Name</th>
                <th>City</th>
            </tr>
        <x:forEach select="$output/students/student" var="student" >
            <tr>
                <td><x:out select="$student/rollno" ></x:out></td>
                <td><x:out select="$student/name" ></x:out></td>
                <td><x:out select="$student/city" ></x:out></td>
            </tr>
        </x:forEach>
        </table>
    </body>
</html>
