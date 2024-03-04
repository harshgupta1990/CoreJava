package constructor;

class B
{

	B(){
	
	System.out.println("B");
	
	}
	
	B(String name){
	
	System.out.println("name");
	
	}

}



public class Test extends B
{

	Test()
	{
	
		System.out.println("test");
	
	}
	
	Test(String name)
	{
	
	       this();
	
	System.out.println("test constructor");

	}


	public static void main(String[] args) 
	{
	
	          Test t=new Test("a");
	
	}

}