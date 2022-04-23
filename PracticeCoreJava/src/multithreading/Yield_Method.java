package multithreading;

class A extends Thread
{ 
	public void run()
	{
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()
				+ " Hiii");
			if(i==2) {
				yield();
			}
		}
	}
}

public class Yield_Method 
{
	
	public static void main(String[] args) 
	{
		
		A a = new A();
		A b = new A();
		a.setName("A");
		b.setName("B");
		a.start();
		b.start();
		
		
		System.out.println("Main");
	}

}
