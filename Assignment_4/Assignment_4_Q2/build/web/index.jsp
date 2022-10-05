<%-- 
    Document   : index
    Created on : 2 Oct, 2022, 2:41:44 PM
    Author     : Mahin Sojitra
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Database Table | </title>
    </head>
    <body>
        <%
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql:///java");
                Statement s = con.createStatement();
                ResultSet rs = s.executeQuery("SELECT * FROM info");
                out.print("<table border=2>");
                out.print("<tr>");
                out.print("<th>Name</th>");
                out.print("<th>City</th>");
                out.print("</tr>");
                out.print("<tr>");
                while (rs.next()) {
                    out.print("<td>"+rs.getString(0)+"</td>");
                    out.print("<td>"+rs.getString(1)+"</td>");
                }
                out.print("</tr>");
                out.print("</table>");
            }
            catch(Exception e)
            {out.print(e);}
        %>
    </body>
</html>
