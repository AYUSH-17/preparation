package org.example.dsa;

public class ReverseString {

    public String reverseStr(String str){
        char[] ch = str.toCharArray();
        int start = 0;
        int end   = str.length() - 1;

        while(start<end){
            if(ch[start] == ' '){
                start++;
            }
            else if(ch[end] == ' '){
                end--;
            }
            else {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] =temp;
                start++;
                end--;
            }
        }
        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverseStr(" This is Ayush "));
    }
}
