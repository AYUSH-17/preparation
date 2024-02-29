package org.example.coding.BasicCoding;

public class PalindromeNumber {
    public static boolean checkPalindrome(int num){
        int og = num;
        int sum = 0;
        while(num!=0) {
            int remainder = num % 10;
            sum = (sum * 10) + remainder;
            num = num / 10;
        }
        return sum==og;
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome(121));
        System.out.println(checkPalindrome(321));
    }
}
