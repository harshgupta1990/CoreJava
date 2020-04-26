package harshit;

import java.util.Scanner;

public class SwapTwoNoUsingThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0,b=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two nos to be swapped :- ");
		System.out.print("a= ");
		a= sc.nextInt();
		System.out.print("\nb= ");
		b= sc.nextInt();
		
		int temp=0;  // 3rd temp variable
		
		//now logit to swap
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("Swapped nos are :- ");
		System.out.println("a= " + a + " b= " + b);
		
	}

}
