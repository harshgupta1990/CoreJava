package basic;

import java.util.Scanner;

public class CheckPrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the No:- ");
		int n=sc.nextInt();
		boolean flag=true;
		
		if(n==1 || n==2) {
			System.out.println(n + " is a Prime No");
		}
		
		else {
			
				for(int i=2;i<n;i++)
				{
					if(n%i==0)
					{
						flag=false;
						break;
					}
		
				}
		
				if(flag==true)
				{
					System.out.println(n + " is a Prime No");
				}
				else
				{
					System.out.println(n + " is not a Prime No");
				}
		}
	}

}