/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author kenil
 */
public class Secon_page extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
    {
            res.setContentType("text/html");
            Cookie[] c= req.getCookies();
            PrintWriter out = res.getWriter();
            out.print("<h1>Stud enrolment no is "+c[0].getValue()+"</h1>");
    }
}
