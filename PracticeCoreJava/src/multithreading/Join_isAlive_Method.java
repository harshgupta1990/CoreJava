package multithreading;

class Mythread extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("MyThread isAlive:- "+Thread.currentThread().isAlive());
		}
		System.out.println("Exit from MyThread");
	}
}

public class Join_isAlive_Method {

	public static void main(String[] args) {
		
		Mythread t = new Mythread();
		t.start();
		
		System.out.println("Hello");
		
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("In Main MyThread isAlive:- "+t.isAlive());
	}

}
