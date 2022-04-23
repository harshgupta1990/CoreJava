package method_hiding;

class P
{
	public static void show()
	{
		System.out.println("Parent show");
	}
}

class Q extends P
{
	public static void show()
	{
		System.out.println("Child show");
	}
}

public class Test {

	public static void main(String[] args) {

			P p = new P();
			p.show();
			
			Q q = new Q();
			q.show();
			
			P p1 = new Q();
			p1.show();

	}

}
