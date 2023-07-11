package basic;

import java.util.Scanner;
import java.util.logging.Logger;

public class Factorial {

	public static void main(String[] args) {
		
		int n, fact=1;
		System.out.println("Enter the no:-");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		int n1=n;
		
		while(n1>0) {
			fact=fact*n1--;
		}
		
		System.out.println("Factorial of " + n + " is " + fact);
	

	}

}
