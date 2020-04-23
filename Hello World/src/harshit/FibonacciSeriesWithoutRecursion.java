package harshit;

import java.util.Scanner;

public class FibonacciSeriesWithoutRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0,b=1,c=0;
		
		int n=0;
		
		System.out.print("Enter the no of digits in series:- ");
		
		Scanner sc=new Scanner(System.in);
		
		n=sc.nextInt();
		
		
		System.out.println("Fibonacci Series:- ");
		
		System.out.print(a+", "+b);
		
		for(int i=0; i<n-2; i++)
		{
			c=a+b;
			
			System.out.print(", "+c);
			
			a=b;
			b=c;
		}
	}

}
