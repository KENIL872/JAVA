

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Include_Page_Second extends HttpServlet {

    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
    {
       res.setContentType("text/html"); 
       PrintWriter out = res.getWriter();
       out.print("<br>Subject : java");
       out.print("<br>Div : F2");
    }
    
}
