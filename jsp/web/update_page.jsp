<%-- 
    Document   : update_page
    Created on : Oct 5, 2022, 7:25:09 PM
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
                
                PreparedStatement p=con.prepareCall("update cia set name='piggy' where id="+request.getParameter("id"));
                int i = p.executeUpdate();
                if(i==1)
                {
                    RequestDispatcher rd  = request.getRequestDispatcher("newjsp.jsp");
                    rd.forward(request, response);
                }
                out.print("record updated");
            }
            catch(Exception e){
                out.print(e);
            }
        %>
    </body>
</html>
