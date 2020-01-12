package console_based_chatbot_for_diabetic_patients;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import java.util.logging.Level;
import java.util.logging.Logger;

public interface Chatbot {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String doctor_input="";
		
		System.out.println("************ Welcome to ABC Diagnostic and Treatment Center ************");
		System.out.print("Your Name:- ");
		
		String patient_name=sc.nextLine();
		
		Connection conn=DatabaseConnection.getConnection();
		
		Statement stmt;
		try {
			stmt = conn.createStatement();
		
		
		ResultSet rs= stmt.executeQuery("select * from chatbot");
		
				
		String finalResult=	UtilityMethods.matchSymptoms(rs,sc);
				
						System.out.println("finalResult:-"+ finalResult);
			
				
	
		if(finalResult!="")
		{
			System.out.println("Mr. "+patient_name + ", you may have following disease:- \n" +  finalResult.split("#")[2] + "\n\nSo you should follow these remedies:- \n" + finalResult.split("#")[3]);
		}
		
		else
		{
			System.out.println("Mr. "+ patient_name + ", you do not have any problem. Just eat healthy and do regular exercise.");
		}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
