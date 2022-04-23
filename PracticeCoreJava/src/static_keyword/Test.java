package static_keyword;


class A
{
	public static int a;

	static {
		int x=12;
		System.out.println("static block class A");
	}
	
	int y=23;
}

public class Test {
	
	
	
	static int i=10;
	int k=12;
	
	static {
		
		System.out.println("static block class Test");
	}
	
	public void show() {
		System.out.println(i);
		System.out.println(k);
		
	}
	
	static void m1(int a) {
		System.out.println(a);
	}
	
	static void m1(double d) {
		System.out.println(d);
	}

	public static void main(String[] args) {
		
		System.out.println(i); 
		//System.out.println(k);
		
		m1(20.99);
		
		A obj =new A();
		A.a=23;
		System.out.println(obj.y + "---" + obj.a);
		
		A.a=47;
		
		
		System.out.println(obj.y + "---" + obj.a);
		
		A obj1 = new A();
		System.out.println(obj1.a);
		

	}
	
	

}

