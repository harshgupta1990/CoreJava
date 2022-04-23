package collection;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMap1 {

    public static void main(String args[]) {

        Map<String,String> map=new IdentityHashMap<String,String>();

        map.put(new String("A"),"First");

        map.put(new String("A"),"Second");

        System.out.println(map);

    }

}
