package imp_coding_questions;

import java.util.Scanner;

public class Swap2noswithoutusing3rdvariable {

	public static void main(String[] args) {
	
		int n1,n2;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter n1:- ");
		n1=sc.nextInt();
		
		System.out.println("Enter n2:- ");
		n2=sc.nextInt();
		
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		
		
		System.out.println("After swapping");
		System.out.println("n1= " + n1);
		System.out.println("n2= " + n2);

	}

}
