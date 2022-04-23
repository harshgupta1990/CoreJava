package collection;

import java.util.*;

public class Arraylist1  {

     public static void main(String args[])  {

         List<Integer> list1 = new ArrayList<Integer>();

         list1.add(new Integer(1));

         list1.add(new Integer(2));

         list1.add(new Integer(3));

         list1.remove(1);

         System.out.println(list1);

     }

 }