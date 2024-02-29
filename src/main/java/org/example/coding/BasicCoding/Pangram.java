package org.example.coding.BasicCoding;

public class Pangram {

    public static boolean chekcPangram(String str){
        boolean[] mark = new boolean[26];
        int index =  0 ;

        for(int i = 0 ; i<str.length() ; i++){
            if('A' <= str.charAt(i) && str.charAt(i) <= 'Z' ) {
                index = str.charAt(i) - 'A';
            } else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                index = str.charAt(i) - 'a';
            }
            mark[index] = true;
        }
        for(boolean flag : mark){
            if(!flag)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println(chekcPangram(str));
    }

}
