
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Forward_page extends HttpServlet {
    
    @Override
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
    {
        String n=req.getParameter("userName");  
        String p=req.getParameter("userPass");  
        if(p.equals("kenil"))
        {
            RequestDispatcher rd=req.getRequestDispatcher("Forward_Page_1");
            rd.forward(req, res);  
        }
        else
        {
            PrintWriter out = res.getWriter();
            out.print("");
        }
    }
}
