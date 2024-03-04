package basic;

import java.util.Scanner;

public class PrintPrimeNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter th No:- ");
		int n=sc.nextInt();

		System.out.println("Prime nos between 1 and " + n +  " are:- ");
		
		for(int i=2;i<=n;i++)
		{
			boolean flag=true;
			
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
	
			}

		
		
			if(flag==true)
			{
				System.out.print(i + " ");
			}
	   }
		
	}

}