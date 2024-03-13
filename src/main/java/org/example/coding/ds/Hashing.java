package org.example.coding.ds;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashing {
    public static void main(String[] args) {
        HashMap<String,Integer>  map = new HashMap<>();
        map.put("India",200);
        map.put("US",122);
        map.put("China",180);
        map.put("US",234);//update old to new value
        map.containsKey("US");
        map.remove("US");
      //  System.out.println(map.containsKey("US"));
        for(Map.Entry<String ,Integer> e : map.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue() );
        }

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " "+ map.get(key));
        }
    }
}
