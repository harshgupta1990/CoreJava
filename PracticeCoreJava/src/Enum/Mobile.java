package Enum;

//public class Mobile
//{
//	static final Mobile APPLE = new Mobile();
//	static final Mobile SAMSUNG = new Mobile();
//	static final Mobile HTC = new Mobile();
//	static final Mobile NOKIA = new Mobile();
//	static final Mobile ONEPLUS = new Mobile();
//	static final Mobile REDMI = new Mobile();
//	static final Mobile KARBON = new Mobile();
//}


interface Demo1
{
	
}

public enum Mobile implements Demo1 
{
	APPLE(100), SAMSUNG, HTC(40), NOKIA(20), ONEPLUS(80), REDMI(50), KARBON(10);
	
	int price;
	
	int getPrice()
	{
		return price;
	}
	
	Mobile()
	{
		price=70;
		System.out.println("Default Constructor");
	}
	
	Mobile(int p)
	{
		price=p;
		System.out.println("Parameterised Constructor");
	}
}






