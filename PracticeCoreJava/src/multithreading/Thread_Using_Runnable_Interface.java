package multithreading;

//class MyThread1 implements Runnable
//{
//
//	@Override
//	public void run() 
//	{
//		System.out.println("MyThread: Hi");
//	}
//	
//}

public class Thread_Using_Runnable_Interface 
{
	
	public static void main(String[] args) 
	{
		//Thread t = new Thread(new MyThread1());
		
		
//		Thread t = new Thread(new Runnable() 
//		{
//
//			@Override
//			public void run() {
//				
//				System.out.println("MyThread: Hi");
//			}		
//			
//		});
		
		
//		Runnable r= () -> {
//			
//				System.out.println("MyThread: Hello");
//			};
//		
//		Thread t = new Thread(r);
		
		
		Thread t = new Thread( () -> System.out.println("MyThread: Hello Lembda") );
		
		
		
		t.start();
		
		
		
		
	}

}
