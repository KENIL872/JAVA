//3. Write a program for CallableStatement statement with stored procedure returns OUT parameters

package Assignment_1;
import java.sql.*;

public class Assignment_1_3 
{
    public static void main(String[] args) 
	{
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql:///java_Demo","root","");
            CallableStatement Cs = con.prepareCall("call infoInsert(?,?,?)");
            Cs.registerOutParameter(1,Types.INTEGER);
            Cs.setString(2, "Priyank");
            Cs.setString(3, "una");
            Cs.executeUpdate();
            System.out.println("Your id is : "+Cs.getInt(1));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}