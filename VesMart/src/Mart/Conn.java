package Mart;

import java.sql.*;

//import com.mysql.jdbc.Connection;
public class Conn{
	Connection con;
	Statement st;
	PreparedStatement ps;
	public Conn()
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://project.cs52q5jxyll8.us-east-1.rds.amazonaws.com/project","root","YSMVESIT");
			st=con.createStatement();
		} 
		catch (Exception e) 
		{
			System.out.println("ERROR IN CONNECTION");
		}
	}

}
