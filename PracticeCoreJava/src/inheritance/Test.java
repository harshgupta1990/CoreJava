package inheritance;

public class Test implements Left, Right{


		@Override
		public void m1() {
			
			System.out.println("Test class");
		}
		
		public static void main(String[] args) {
			
			Test t = new Test();
			//t.show();
			
			Left.show();
			Right.show();
			
			t.m1();
				

	}

}
