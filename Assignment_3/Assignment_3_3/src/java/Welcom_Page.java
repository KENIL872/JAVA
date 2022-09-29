

import java.io.*;
import java.sql.SQLException;
import javax.servlet.*;
import javax.servlet.http.*;


public class Welcom_Page extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.print("Wlecom over page ,"+ req.getParameter("userName"));
    }
}
