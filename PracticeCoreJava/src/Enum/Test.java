package Enum;

//enum Mobile 
//{
//	APPLE, SAMSUNG, HTC, NOKIA, ONEPLUS, REDMI, KARBON;
//	
//}

public class Test {

	public static void main(String[] args) {
		
		Mobile m = Mobile.SAMSUNG;
		
		switch(m)
		{
			case APPLE: System.out.println("APPLE"); break;
			case HTC: System.out.println("HTC"); break;
			case SAMSUNG: System.out.println("SAMSUNG"); break;
			case NOKIA: System.out.println("NOKIA"); break;
			case REDMI: System.out.println("REDMI"); break;
			case ONEPLUS: System.out.println("ONEPLUS"); break;
			default: System.out.println("Default");
		}
		
		System.out.println(m.price);
		
		Mobile[] mobiles = Mobile.values();
		
		for(Mobile mobile: mobiles)
		{
			System.out.println(mobile.name());
		}
	}

}
