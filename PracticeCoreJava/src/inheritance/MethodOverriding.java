package inheritance;

import inheritance.subpackage.Disco;

class A extends B{
	
	    public void m1() {
		System.out.println("A");
		
//		Disco d = new Disco();
//		d.disco();
		
		A a =new A();
		a.disco();
	}
}

class B extends Disco {
	
	public void m1() {
		System.out.println("B");
	}
	
	public static void main(String[] args) {
		
//		Disco d = new Disco();
//		d.disco();
		
		B b =new B();
		b.disco();
		
//		A a new A();
//		a.disco();
	}
}

public class MethodOverriding extends A {

	public void m1()
	{
		System.out.println("MethodOverriding");
	}
	
	public void m2() {
		System.out.println("B");
	}
	
	public static void main(String[] args) {
		
		A a = new A();
		a.m1();
		
		MethodOverriding mo = new MethodOverriding();
		mo.m1();
		
		A a1 =new MethodOverriding();
		a1.m1();
		
		//a1.m2();
		

	}

}
