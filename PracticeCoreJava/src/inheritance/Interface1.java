package inheritance;

interface Left{
	
	static void show(){
		System.out.println("Left Show");
	}
	
	default void m1() {
		
		System.out.println("Left Interface");
	}
}



interface Right{
	
	static void show(){
		System.out.println("Right Show");
		}
	
	default void m1() {
		
		System.out.println("Right Interface");
	}
}
