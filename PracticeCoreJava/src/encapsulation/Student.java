package encapsulation;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	
	private int id;          //data hiding
	private String name;	 //data hiding
	
	Scanner sc = new Scanner(System.in);
	
	ArrayList<Student> students = new ArrayList<>();
	
	private int getId() {                                  //Abstraction
		
			return id;
	}

	
	private void setId(int id) {                            //Abstraction

			this.id = id;

	}
	
	
	private String getName() {                             //Abstraction
		
			return name;
	}
	
	
	private void setName(String name) {                    //Abstraction
		
			this.name = name;
	}
	
	
	public void getStudentInfo() {                      //Abstraction
		
		System.out.println("Enter the password:- ");
		if(sc.next().equals("12345")) {
			System.out.println("Authenticated :)");
			System.out.println(this.getId());
			System.out.println(this.getName());
		}
		else {
			System.out.println("Authentication Failed :(");
		}
		
	}
	
	public void setStudentInfo() {               //Abstraction
		
		System.out.println("Enter the password:- ");
		if(sc.next().equals("12345")) {
			System.out.println("Authenticated :)");
			
			System.out.println("Enter the studentid:- ");
			this.setId(sc.nextInt());
			
			System.out.println("Enter the studentname:- ");
			this.setName(sc.next());
			
			students.add(this);
		}
		else {
			System.out.println("Authentication Failed :(");
		}
			
	}
	
	
		public void getAllStudentsInfo() {                      //Abstraction
		
		System.out.println("Enter the password:- ");
		if(sc.next().equals("12345")) {
			System.out.println("Authenticated :)");
			
			for(Student s: students) {
			System.out.println(students);
			}
			
		}
		else {
			System.out.println("Authentication Failed :(");
		}
		
	}


		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", sc=" + sc + "]";
		}
	
}
