package basic;

import java.util.Scanner;

public class LargestNo {
	
	public static void main(String[] args) 
	{
		
		System.out.println("Enter how many numbers do you want to compare:- ");
	
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		
		int[] numbers = new int[size];
		
		System.out.println("Enter the numbers:- ");
		
		for(int i=0;i<size;i++)
		{
			numbers[i]=sc.nextInt();
		}
		
		System.out.println("Nos are:- ");
		for(int i=0;i<size;i++)
		{
			System.out.println(numbers[i]);
		}
	
		int max=numbers[0];
		
		for(int i=0;i<size;i++)
		{
			if(max<numbers[i])
				max=numbers[i];
		}
		
		System.out.println("Max no is " + max);
		
	}

}
