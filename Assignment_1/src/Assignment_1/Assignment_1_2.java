
package Assignment_1;
import java.sql.*;

public class Assignment_1_2 
{
    public static void main(String[] args) 
	{  
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql:///java_Demo","root","");
            PreparedStatement Ps = con.prepareStatement("insert into info(name,city) values(?,?)");
            Ps.setString(1, "rasendra");
            Ps.setString(2, "simasi");
            System.out.println("Record inserted.: "+Ps.executeUpdate());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
