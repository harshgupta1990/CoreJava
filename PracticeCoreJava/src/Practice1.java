public class Practice1 {
		public static void main(String[] args) {
		     someMethod(null);
		}
		public static void someMethod(Object o) {
		 System.out.println("Object method Invoked");
		}
		public static void someMethod(String s) {
		 System.out.println("String method Invoked");
		}
		}
