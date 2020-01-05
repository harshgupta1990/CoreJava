package console_based_chatbot_for_diabetic_patients;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DatabaseConnection {

	public static Connection getConnection()
	{
		 String url = "jdbc:postgresql://localhost:5432/chatbot";
	     String user = "postgres";
	     String password = "postgres";
	
	     Connection con=null;
	     
		 try 
		 {
			con = DriverManager.getConnection(url, user, password);
			
			//System.out.println("Connection Created");
		 } 
		 
		 catch (SQLException e) 
		 {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	     return con;
	}
}
