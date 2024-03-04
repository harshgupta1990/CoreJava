package imp_coding_questions;

import java.util.HashMap;

public class Count_the_number_of_words_in_a_string_using_HashMap {

	public static void main(String[] args) {
		
		String str="Hey am I am Harshit";
		String s[]= str.split(" ");
	
		HashMap<String, Integer> map = new HashMap<>();
		
		int i=0;
		while(i<s.length)
		{
			if(map.containsKey(s[i]))
			{
				map.put(s[i], map.get(s[i])+1);
			}
			else 
				map.put(s[i], 1);
			i++;
		}
		
		System.out.println(map);

	}

}
