package Overriding;  

class P{
	
	public Object m1() 
	{
		return null;
	}
	
	private void m2()
	{
		System.out.println(" private m2 P class");
	}
	
	public void show()
	{
		System.out.println("class p ");
	}
}

class Q extends P
{
	public final void show() 
	{
		System.out.println("class Test1");
	}
}


public class Test1 extends Q {

	@Override
//	public String m1() {    // covarient return type  //session 40  // covarient return type concept only for object types. not for primitives
//		return null;	
//	}
	
//	private void m2()
//	{
//		System.out.println(" private m2 Test1 class");
//	}
	
	public void show() 
	{
		System.out.println("class Test1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		P p = new P();
		//p.m2();
		
		Test1 t = new Test1();
		t.m2();

	}

}
