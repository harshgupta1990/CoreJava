package basic;

import java.util.Scanner;

public class FactorialWithoutRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the no for which you want to find the factorial:-");
		int n=sc.nextInt();
		
		int num=n;
		
		int fact=1;
		
		while(n!=0)
		{
			fact=fact*n;
			n=n-1;
		}
		
		System.out.println("Factorial of " + num + " is :- " + fact);

	}

}
