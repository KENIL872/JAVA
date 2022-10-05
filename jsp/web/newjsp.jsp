<%-- 
    Document   : newjsp
    Created on : Oct 5, 2022, 6:21:33 PM
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
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql:///ciaprac","root","");
                Statement s = con.createStatement();
                ResultSet rs =s.executeQuery("Select * from cia");
                out.print("<table border=1><tr><th>Id</th><th>Name</th><th>Phone_no</th><th>Delete</th><th>Edit</th></tr>");
                while(rs.next())
                {
                    out.print("<tr><td>"+rs.getInt(1)+"</td>");
                    out.print("<td>"+rs.getString(2)+"</td>");
                    out.print("<td>"+rs.getString(3)+"</td>");
                    out.print("<td>"+"<a href='delete_page.jsp?id="+rs.getInt(1)+"'>Delete</a>"+"</td>");
                    out.print("<td>"+"<a href='update_page.jsp?id="+rs.getInt(1)+"'>Edit</a>"+"</td>");
                    out.print("</tr>");
                }
                out.print("</table>");
            }
            catch(Exception e)
            {
                out.print(e);
            }
        %>
    </body>
</html>
