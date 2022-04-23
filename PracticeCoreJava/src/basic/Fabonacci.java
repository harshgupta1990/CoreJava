package basic;

import java.util.Scanner;

public class Fabonacci {

	public static void main(String[] args) {
		
		int a=0,b=1,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no of elements:- ");
		int n=sc.nextInt();
		int i=0;;
		System.out.print("0, 1, ");
		while(i<(n-2))
		{
			c=a+b;
			a=b;
			b=c;
			if(i==(n-3))
				System.out.print(c);
			else
				System.out.print(c + ", ");
			i++;
		}
		
	}

}
