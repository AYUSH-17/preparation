package org.example.coding.BasicCoding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class EvenLengthString {
    public static HashMap printEvenLengthString(String str){
        String[] str1 = str.split(" ");
        HashMap<String,Integer> map = new LinkedHashMap<>();
        for(String str2 : str1){
            //System.out.println(str);
            if(str2.length() % 2 == 0) {
                if(map.containsKey(str2))
                map.put(str2,str2.length());
            }
        }
        return map;
    }

    public static void main(String[] args) {
        String str = "DEVIN will go hell";
        System.out.println(printEvenLengthString(str));
    }
}
