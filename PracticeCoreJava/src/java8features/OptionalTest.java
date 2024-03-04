package java8features;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) 
	{
		Integer[] array = new Integer[5];
		
	//	System.out.println(array[3].toString());
		
		array[3]=9;
		Optional<Integer> optional = Optional.ofNullable(array[3]);
		
		if(optional.isPresent())
		{
			System.out.println(optional.get());
			System.out.println(optional);
			System.out.println(array[3]);
		}
		
		

	}

}
