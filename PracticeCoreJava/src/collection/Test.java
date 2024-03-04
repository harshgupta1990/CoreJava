package collection;

import java.util.Arrays;
import java.util.List;

public class Test{

     public static void main(String []args){

        Integer arr[]={1,2,3};

        List<Integer> list=Arrays.asList(arr);  // line no 5

        list.add(5);

        System.out.println(list);

     }

}
