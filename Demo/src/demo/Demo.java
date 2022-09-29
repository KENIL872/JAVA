package demo;
import java.sql.*;

public class Demo 
{
    public static void main(String[] args) 
	{
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql:///java_Demo","root","");
            Statement s = con.createStatement();
            String sql = "create table stud (Sd_id integer,Sname varchar(20),STD_ varchar(20));";
            s.execute(sql);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}