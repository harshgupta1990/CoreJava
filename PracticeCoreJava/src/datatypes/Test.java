package datatypes;

import java.util.Arrays;

public class Test{

public static void main(String[] args)
{

	Boolean[] arr = new Boolean[2];
	
	arr[0] = new Boolean(true);
	
	arr[1] = new Boolean(Boolean.parseBoolean("test")); // line no 7
	
	System.out.println(Arrays.toString(arr));

    }

}