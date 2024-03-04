package basic;

import java.util.Scanner;

public class SwapTwoNoWithoutUsingThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two nos to be swapped:-");
		System.out.print("a= ");
		int a=sc.nextInt();
		System.out.print("b= ");
		int b=sc.nextInt();

		//logic
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println();
		System.out.println("After Swap:-");
		System.out.println("a= " + a);
		System.out.println("b= " + b);
	}

}
