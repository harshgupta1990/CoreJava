package java8features;

public class FunctionalInterfaceTest implements FunctionalInterfaceDemo {

	@Override
	public void test()
	{
		System.out.println("Implemented Test mothod");
	}
	
	@Override
	public void defaultMethod()
	{
		System.out.println("FunctionalInterfaceTest default method");
	}
	
//	@Override
//	public static void staticMethod()
//	{
//		
//	}
	
	public static void main(String[] args) {
		
		FunctionalInterfaceDemo obj = new FunctionalInterfaceTest();
		
		obj.test();
		obj.defaultMethod();
		FunctionalInterfaceDemo.staticMethod();
		
	}

}
