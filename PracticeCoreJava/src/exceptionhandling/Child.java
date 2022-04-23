package exceptionhandling;

import java.io.*;

class Mother { 

  void smile()
  {
	  	try {
	  		 System.out.println("parent smile");
	  		 FileInputStream f = new FileInputStream(new File("dd"));
	  	}
	  	
	  	catch(FileNotFoundException e)
	  	{
	  		
	  	}
     

  } 

} 

 

public class Child extends Mother{ 

  void smile() throws FileNotFoundException { 

    System.out.println("child smile"); 

  } 

 

  public static void main(String args[]) throws IOException{ 

   Mother p=new Child(); 

   p.smile(); 

  } 

} 