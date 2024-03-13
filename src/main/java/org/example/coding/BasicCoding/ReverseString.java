package org.example.coding.BasicCoding;

import java.util.Arrays;

public class ReverseString {
    public static String rev(String str){
        if(str.isEmpty()) {
            return str;
        }
        return rev(str.substring(1))+str.charAt(0);
    }

    public static StringBuilder finalResult(String str){
        String[] words = str.split(" ");
        StringBuilder reversedString = new StringBuilder();
        for(String word : words){
            String reverseWord = rev(word);
            reversedString.append(reverseWord).append(" ");
        }
        return reversedString;
    }

    public static String preserveSpace(String str){
        int len = str.length();
        char ch ;
        String result="";
        for(int i = 0 ; i<len ;i++){
            ch = str.charAt(i);
            if(ch!=' '){
               result = result + ch ;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "hello my name is ashi";
        StringBuilder sen = new StringBuilder();

        //System.out.println(finalResult("hello my name is ashi"));
        String[]  words = str.split(" ");
        for(String word : words){
            sen.append(word);
        }
       // System.out.println(sen);
        System.out.println(preserveSpace(str));

    }
}
