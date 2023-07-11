package basic;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) 
	{
		
		int n;
		boolean isPrime=true;
		
		System.out.println("Enter the no:- ");
		
		Scanner sc = new Scanner(System.in);
		
		n=sc.nextInt();
		
		if(n==0 || n== 1)
		{
			isPrime=false;
		}
			
		if(n==2)
		{
			isPrime=true;
		}
			
		if(n>2)
		{
			for(int i=2; i<n;i++)
			{
				if(n%i==0)
				{
					isPrime=false;
					break;
				}
			}	
		}
		
		if(isPrime)
		{
			System.out.println("Prime");
		}
		else
			System.out.println("Not Prime");

	}

}
