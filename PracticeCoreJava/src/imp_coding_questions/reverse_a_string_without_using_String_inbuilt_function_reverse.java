package imp_coding_questions;

public class reverse_a_string_without_using_String_inbuilt_function_reverse {

	public static void main(String[] args) {
		
		String str="Harshit";
		String rev="";
		
		for(int i=0; i<str.length();i++)
		{
			char ch = str.charAt(i);
			rev=ch+rev;
		}
		
		System.out.println(rev);
	}

}
