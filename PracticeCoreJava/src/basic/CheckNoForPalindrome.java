package basic;

import java.util.Scanner;

public class CheckNoForPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no:- ");
		int n=sc.nextInt();
		
		int num=n,rev=0;
		
		while(num!=0)
		{
			rev=rev*10;
			rev=rev+num%10;
			num=num/10;
		}
		
		if(n==rev)
		{
			System.out.println(n + " is a Palindrome No.");
		}
		else
		{
			System.out.println(n + " is not a Palindrome No.");
		}

	}

}
