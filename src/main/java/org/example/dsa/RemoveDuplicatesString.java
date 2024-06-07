package org.example.dsa;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesString {
    public static Set<String> removeDuplicate(String str){
        Set<String> set = new LinkedHashSet<>();
        String[] sent = str.split(" ");
        System.out.println();
        for(String str1 : sent){
            set.add(str1);
        }
        return set;
    }

    public static void main(String[] args) {
        String str = "This This is the Duplicate Sentence which is Duplicate of the current Sentence";
        RemoveDuplicatesString.removeDuplicate(str).stream().forEach(e -> System.out.print(e + " "));
    }
}
