<%-- 
    Document   : insert_page
    Created on : Oct 5, 2022, 7:22:58 PM
    Author     : kenil
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql:///ciaprac","root","");
                PreparedStatement p=con.prepareCall("insert into cia (name,phone_no) values(?,?)");
                p.setString(1, "yash");
                p.setString(2, "7777998888");
                p.executeUpdate();
                out.print("record inserted");
            }
            catch(Exception e){
                out.println(e);
            }
        %>
    </body>
</html>
