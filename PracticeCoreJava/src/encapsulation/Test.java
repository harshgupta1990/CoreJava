package encapsulation;

import java.io.Console;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		
		
		Scanner sc = new Scanner(System.in);
		
		char ch='n';
		
		do {
				System.out.println("Menu");
				System.out.println("1. Get Studnt Info");
				System.out.println("2. Set Student Info");
				System.out.println("3. Get All Students Info");
				
				System.out.println("Enter your choice:- ");
				int choice = sc.nextInt();
				
				if(choice == 1) {
					s.getStudentInfo();
				}
				
				else if(choice == 2) {
					s.setStudentInfo();
				}
				
				else if(choice == 3) {
					s.getAllStudentsInfo();
				}
				
				else {
					System.out.println("Invalid choice. Please enter correct one ");
				}
				
				System.out.println("Do you want to continue:- ");
				ch= sc.next().charAt(0);
				
		}while(ch=='y' || ch=='Y');
	}

}
