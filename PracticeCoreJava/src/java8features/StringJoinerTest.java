package java8features;

import java.util.StringJoiner;

public class StringJoinerTest {

	public static void main(String[] args) {
			
		StringJoiner name = new StringJoiner(",","[","]");
		name.add("Ram");
		name.add("Shyam");
		
		StringJoiner country = new StringJoiner(";" , "{" , "}");
		country.add("India");
		country.add("Germany");
		
		StringJoiner merged = name.merge(country);
		
		System.out.println(merged.toString());
		
		
		

	}

}
