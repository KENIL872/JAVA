<%-- 
    Document   : index
    Created on : 26-Sep-2022, 7:14:22 pm
    Author     : Mahin Sojitra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!Doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Home | Crud Operation System</title>
    </head>
    <body>
<!--        <div class="text-white bg-dark m-2 p-1 border border-dark rounded-4 text-center">
            <h1>Home</h1>
        </div>-->
        <sql:setDataSource driver="com.mysql.jdbc.Driver"
                           url="jdbc:mysql:///java" 
                           user="root" 
                           password=""
                           var="con"
                           scope="session"
                           />
        <sql:query dataSource="${con}" var="rs">
            select * from student
        </sql:query>

        <div>
            <table border="3" cellspacing="7" cellpadding="10">
                <tr>
                        <th colspan="7">Student</th>
                </tr>
                <tr>
                        <th>Name</th>
                        <th>Email Id</th>
                        <th>Phone</th>
                        <th>City</th>
                        <th>Course</th>
                        <th>Delete Record</th>
                </tr>
                <c:forEach items="${rs.rows}" var="value">
                    <tr>
                        <td>${value.name}</td>
                        <td>${value.email}</td>
                        <td>${value.phone}</td>
                        <td>${value.city}</td>
                        <td>${value.course}</td>
                        <td align="center"><a href="deleteRecord?id=${value.id}">Delete</a></td>
                    </tr>
                </c:forEach>
            </table>       
        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8" crossorigin="anonymous"></script>
    </body>
</html>
