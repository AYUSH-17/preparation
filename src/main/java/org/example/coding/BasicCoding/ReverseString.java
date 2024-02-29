package org.example.coding.BasicCoding;

import java.nio.file.LinkPermission;

public class ReverseString {
    public static String rev(String str){
        if(str.isEmpty()) {
            return str;
        }
        return rev(str.substring(1))+str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(rev("Ayush"));
    }
}
