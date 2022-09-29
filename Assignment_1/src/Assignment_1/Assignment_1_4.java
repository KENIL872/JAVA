package Assignment_1;
import java.sql.*;

public class Assignment_1_4 
{
    public static void main(String[] args) 
	{
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql:///java_Demo","root","");
            CallableStatement c = con.prepareCall("select *from info");
            ResultSetMetaData Rsm = c.getMetaData();
            ResultSet  Rs = c.executeQuery("select *from info");
            for(int i=1;i<=Rsm.getColumnCount();i++)
            {
                System.out.print("  \t"+Rsm.getColumnName(i));
            }
            while(Rs.next()) 
            {
                System.out.printf("%3d",Rs.getInt(1));
                System.out.printf("%20s",Rs.getString(2));
                System.out.printf("%20s\n",Rs.getString(3));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
