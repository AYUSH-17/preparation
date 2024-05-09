package org.example.coding.BasicCoding;

public class SumOfTwoString {
    public static String addTwoString(String str1, String str2){
        int firstString = Integer.parseInt(str1);
        int secondString = Integer.parseInt(str2);
        int result = firstString + secondString;
        return String.valueOf(result);
    }

    public static int countWords(String str){
        String[] str1 = str.split(" ");
        int i = 0;
        for(String str2 : str1){
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(addTwoString("111","222"));
        System.out.println(countWords("The DEVIN , Software Engineer"));
    }
}
