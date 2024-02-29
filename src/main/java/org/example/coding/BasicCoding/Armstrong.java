package org.example.coding.BasicCoding;

public class Armstrong {
    public static boolean checkArmstrongNumber(int num){
        int og = num;
        int power = String.valueOf(num).length();
        double sum =0;
        while(num!=0){
            int digit = num % 10;
            sum =  sum + Math.pow(digit,power);
            num = num/10;
        }
        return og == sum;
    }

    public static void main(String[] args) {
        System.out.println(checkArmstrongNumber(8208));
    }
}
