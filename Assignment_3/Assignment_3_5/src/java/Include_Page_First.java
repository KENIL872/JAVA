
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Include_Page_First extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
    {
        res.setContentType("text/html"); 
        PrintWriter out = res.getWriter();
        out.println("Kenil vastarpara");
        RequestDispatcher rd = req.getRequestDispatcher("Include_Page_Second");
        rd.include(req, res);
    }
}
