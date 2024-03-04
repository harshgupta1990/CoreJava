package java8features;
@FunctionalInterface
public interface FunctionalInterfaceDemo {
	
	public void test();
	
	public default void defaultMethod()
	{
		System.out.println("Default method");
	}
	
	public static void staticMethod()
	{
		System.out.println("Static method");
	}
}
