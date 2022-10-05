<%-- 
    Document   : delete
    Created on : 26-Sep-2022, 8:27:46 pm
    Author     : Mahin Sojitra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete | Crud Operation System</title>
    </head>
    <body>
        <!--<h3>Record deleting is under processing.........</h3>-->
        <sql:update dataSource="${con}">
            delete from student where id=${param.id}
        </sql:update>
        <c:redirect url="index" />
    </body>
</html>
