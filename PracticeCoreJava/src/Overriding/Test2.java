package Overriding;

class Parent1{
	int a=28;
}

class Child1 extends Parent1{
	int a=23;
}

public class Test2 {

	public static void main(String[] args) {
		
		Parent1 p = new Parent1();
		System.out.println(p.a);
		
		Child1 q = new Child1();
		System.out.println(q.a);
		
		Parent1 p1 = new Child1();     
		System.out.println(p1.a);     //Overriding is only applicable for methods not 
									  //for variables
		

	}

}
