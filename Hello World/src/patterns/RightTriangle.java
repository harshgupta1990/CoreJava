package patterns;

public class RightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ptrn="*";
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ptrn);
			}
			System.out.println();
		}
	}

}
