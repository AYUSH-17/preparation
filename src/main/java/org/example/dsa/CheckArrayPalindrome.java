package org.example.dsa;

public class CheckArrayPalindrome {

    public static boolean isPalindrome(int nums){
        int sum = 0;
        int num = nums;
        int rem = 0;
        while(num > 0){
            rem = num % 10;
            sum = (sum * 10) + rem;
            num = num/10;
        }
        return sum == nums;
    }

    public static void checkArrayPalindrome(int[] arr){
        boolean flag = false;
        int counter = 0;
       for(int nums : arr){
           flag = isPalindrome(nums);
           if(!flag){
               counter++;
           }
       }
       if(counter == 0){
           System.out.println("Palindrome");
       }
       else{
           System.out.println("Not Palindrome");
       }
    }

    public static void main(String[] args) {
        int[] arr = {111,989,323};
        int[] arr1 = {112,989,323};
        checkArrayPalindrome(arr);
        checkArrayPalindrome(arr1);
    }
}
