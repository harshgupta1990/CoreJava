package overloading;

class Animal{
	
}

class Monkey extends Animal
{
	
}



public class Test {
	
	void m1(String s) {
		System.out.println("String s= " + s);
	}
	
	void m1(StringBuffer s) {
		System.out.println("Stringuffer s= " + s);
	}
	
	void m1(int a) {
		
			System.out.println("int a= " + a);
		}
	
//	void m1(long a) {
//		
//		System.out.println("long a= " + a);
//	}
	
//	void m1(double a) {
//		
//		System.out.println("double a= " + a);
//	}
	

//	void m1(Integer a) {
//		
//		
//		System.out.println("Integer a= " + a);
//	}
//	
//	
//	void m1(Long a) {
//		
//		System.out.println("Long a= " + a);
//	}
//	
//	void m1(Double a) {
//		
//		System.out.println("Double a= " + a);
//	}
	
void m1(Object a) {
		
		System.out.println("Object a= " + a);
	}
	
	
	void m1(int a, float s) {
		System.out.println(" int float Hello");
	}
	
	void m1(float a, int s) {
		System.out.println("float int Hello");
	}
	
	public void m1(Animal a) {
		System.out.println("Animal");
	}
	
	public void m1(Monkey m) {
		System.out.println("Monkey");
	}

	public static void main(String[] args) {
		
		
			Test t = new Test();
			//t.m1("Harshi", 2);
			
			
			t.m1(new Integer((int)(7.9)));   //exact match will get the highest priority
			
			//t.m1(21L);
			
			t.m1('a');     //automatic promotion of arguments to next level datatype will be there 
							//if exact match arg is not there
			
			t.m1(5);
			t.m1("yjygjh");
			t.m1(new StringBuffer("yjygjh"));
			//t.m1(null);
			
			t.m1(10,1.4F);
			t.m1(1.4F,10);
			//t.m1(10,10);    // compiletime error (ambiguous)
			//t.m1(10.8F,10F);   // inorrect
	
			Animal a = new Monkey();
			
			t.m1(new Animal());
			t.m1(new Monkey());
			t.m1(a);
	
	
	
	
	
	}
	

}
