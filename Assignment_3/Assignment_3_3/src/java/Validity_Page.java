
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Validity_Page extends HttpServlet {
    
    @Override
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
    {
        res.setContentType("text/html");
        String n = req.getParameter("userName");
        String p = req.getParameter("userPass");
        if(p.equals("Kenil"))
        {
            RequestDispatcher Rd = req.getRequestDispatcher("Welcom_Page");
            Rd.forward(req, res);
        }
        else
        {
            PrintWriter out = res.getWriter();
            out.print("<font color='red'>PLZ Check Username and Password</font><br><br>");
            RequestDispatcher Rd = req.getRequestDispatcher("/index.html");
            Rd.include(req, res);
            
        }
    }
    
}
