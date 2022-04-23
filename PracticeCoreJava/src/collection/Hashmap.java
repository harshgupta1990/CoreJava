package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {
	
	public static void main(String[] args)
	{
		HashMap<String, String> phonebook = new HashMap<>(); 
		
		phonebook.put("Harshit", "9971409415");
		phonebook.put("Rakesh", "9865435222");
		phonebook.put("Vimal", "3634634636");
		phonebook.put("Mahi", "2352352355");
		phonebook.put("Yugeen", "4353464666");
		
		System.out.println(phonebook.containsKey("Harshit"));
		
		System.out.println(phonebook.containsValue("98654352221"));
		
		System.out.println(phonebook.get("Harshit"));
		
		//System.out.println(phonebook.remove("Yugeen"));
		
		System.out.println(phonebook);
		
		for(Map.Entry<String,String> e: phonebook.entrySet())
		{
			System.out.println(e.getKey() + " <---> " + e.getValue());
		}
		
		System.out.println("size: " + phonebook.size());
		
		for(String key: phonebook.keySet())
		{
			System.out.println("Key: " + key +", Value:- "+ phonebook.get(key));
		}
		
		System.out.println(phonebook.get(null));
		
	}

}
