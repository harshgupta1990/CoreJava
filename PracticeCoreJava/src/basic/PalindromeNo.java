package basic;

import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) {
		
		int n;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:- ");
		
		n=sc.nextInt();
		
		int rev=0, r;
		
		int temp=n;
		while(n>0) 
		{
			r=n%10;          //remainder
			rev=(rev*10)+r;  //main logic
			n=n/10;          //questant is assigned to actual no (it will eliminate the remainder part)
		}
		
		System.out.println("rev is:- " + rev);
		
		if(temp==rev)
			System.out.println(temp + " is palindrome");
		else
			System.out.println(temp + " is not palindrome");
			
		
		

	}

}
