/*
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
public class First_page extends HttpServlet {
        
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.print("<h1>Studernt enrolment no "+req.getParameter("eno")+"</h1>");
        Cookie c = new Cookie("StudEno",req.getParameter("eno"));
        c.setMaxAge(60*60);
        res.addCookie(c);
    }
}