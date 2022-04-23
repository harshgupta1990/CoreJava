package Overriding;


class Parent{
	
	public void property()
	{
		System.out.println("Cash+Gold+Land+Power");
	}
	
	public void marry()
	{
		System.out.println("Apalamma");
	}
}

public class Test extends Parent {
	
	@Override
	public void marry()
	{
		System.out.println("4me+9Tara+3Sha");
	}

	public static void main(String[] args) {
		
			Parent p =new Parent();
			p.marry();
			
			Test test = new Test();
			test.marry();
			
			Parent p1 = new Test();
			p1.marry();
	}

}
