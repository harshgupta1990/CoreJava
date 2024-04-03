package test;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no: -");
		int n = sc.nextInt();
		
		int num = n;
		int rev=0;
		
		while(num!=0) {
			rev=rev*10;
			rev=rev+num%10;
			num=num/10;
		}
		
		if(n==rev) {
			System.out.println("Palindrome no");
		}
		
		else
			System.out.println("Not Palindrome No");
		
		
	}

}
