package collection;

import java.util.*;

public class Arraylist

 {

     public static void main(String args[])

     {

         ArrayList obj = new ArrayList();

         obj.add("A");

         obj.ensureCapacity(3);

         System.out.println(obj.size());

     }

 }