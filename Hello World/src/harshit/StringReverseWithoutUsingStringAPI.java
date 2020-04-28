package harshit;

import java.util.Scanner;

public class StringReverseWithoutUsingStringAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String:- ");
		
		String str=sc.next();
		
		String rev_str="";

		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			rev_str=ch+rev_str;
		}
		
		System.out.println("Reversed String:- " + rev_str);
	}

}
