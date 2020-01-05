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
		String patient_input="";
		String doctor_input="";
		
		System.out.println("************ Welcome to ABC Diagnostic and Treatment Center ************");
		System.out.print("Your Name:- ");
		
		String patient_name=sc.nextLine();
		
		System.out.println();
		
		System.out.print("Your Problem :- ");
		
		patient_input=sc.nextLine();
		
		Connection conn=DatabaseConnection.getConnection();
		
		Statement stmt;
		try {
			stmt = conn.createStatement();
		
		
		ResultSet rs= stmt.executeQuery("select * from chatbot");
		
		String disease="";
		String prescription="";
		String symptoms="";
		
		int count=0;
		
		while(rs.next())
		{
			
			System.out.println("hiii");
			symptoms=rs.getString(2);
			System.out.println("symptoms:-" + symptoms);
			System.out.println("patient_input:- " + patient_input);
			if(patient_input.contains(symptoms))
			{
				disease=disease+rs.getString(4)+", ";
				prescription=prescription+rs.getString(3)+", ";
				
				count=count+1;
			}
		
		}
		
		if(count>0)
		{
			System.out.println(patient_name + ", you may have following disease:- \n" +  disease + "\n\nSo you should follow these remedies:- \n" + prescription);
		}
		
		else
		{
			System.out.println( patient_name + ", you do not have any problem. Just eat healthy and do regular exercise.");
		}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
