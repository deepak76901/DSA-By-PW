import java.util.*;
import java.io.*;

class File1{
    public static void main(String[] args) {
        
        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(4,"Deepak");
        map1.put(2,"Akash");
        map1.put(9,"Kunal");
        map1.put(6,"Vivek");

        // System.out.println("HashMap contains following Data : " + map1);

        // LinkedHashMap<Integer,String> map2 = new LinkedHashMap<>();
        // map2.put(4,"Deepak");
        // map2.put(2,"Akash");
        // map2.put(9,"Kunal");
        // map2.put(6,"Vivek");
        // map2.put(6,"Rahul");

        // System.out.println("LinkedHashMap contains following Data : " + map2);

        // TreeMap<Integer,String> map3 = new TreeMap<>();
        // map3.put(4,"Deepak");
        // map3.put(2,"Akash");
        // map3.put(9,"Kunal");
        // map3.put(6,"Vivek");
        // map3.put(6,"Rahul");

        // System.out.println("TreeMap contains following Data : " + map3);

        // System.out.println(map1.get(2));
        // map1.remove(2);
        // System.out.println(map1.containsKey(6));

        System.out.println(map1);
        
        for(Map.Entry<Integer,String> a : map1.entrySet()){
            System.out.println("Key : " + a.getKey() + " , Value : " + a.getValue());
        }
        
        System.out.println(map1.keySet());
        System.out.println(map1.values());
        map1.clear();
        System.out.println(map1);


    }
}