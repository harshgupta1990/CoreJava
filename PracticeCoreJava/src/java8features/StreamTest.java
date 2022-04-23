package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) 
	{
		List<Person> list = new ArrayList<>();
		
		list.add(new Person(1,"Ram"));
		list.add(new Person(2,"Shyam"));
		list.add(new Person(3,"Vipin"));
		list.add(new Person(4,"Karan"));
		list.add(new Person(5,"Amar"));
		
		List<Person> newlist = list.stream().filter(person -> person.getId()>=3).collect(Collectors.toList());	
		
		System.out.println(newlist.size());
		
		List<Integer> idList = newlist.stream().map(person -> person.getId()).collect(Collectors.toList());
				
		System.out.println(idList);
		
	}

}
