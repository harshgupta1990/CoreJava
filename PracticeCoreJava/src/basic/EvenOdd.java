package basic;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		int n;
		System.out.println("Enter the number:- ");
		Scanner sc =  new Scanner(System.in);
		
		n=sc.nextInt();
		
		if(n%2==0)
			System.out.println("Even No");
		else
			System.out.println("Odd No");

	}

}
