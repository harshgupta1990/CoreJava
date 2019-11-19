package harshit;

import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String args[]){
		
		int n=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no:");
		n=sc.nextInt();
		
		if(n%2==0){
			
			System.out.println(n+" is a even no.");
		}
		
		else{
			
			System.out.println(n+" is a odd no.");
		}
		
		sc.close();
	}

}
