import java.io.IOException;
import java.rmi.ServerException;
import javax.servlet.http.*;


public class HttpSevDemo extends HttpServlet{
//    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServerException,IOException
//    {
//        res.getWriter().print("kenil");
//    }
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServerException,IOException
    {
        allMethods(req, res);
    }
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServerException,IOException
    {
        allMethods(req, res);
    }
    public void allMethods(HttpServletRequest req,HttpServletResponse res) throws ServerException,IOException
    {
        res.getWriter().print("kenil "+req.getParameter("name"));
    }
}
