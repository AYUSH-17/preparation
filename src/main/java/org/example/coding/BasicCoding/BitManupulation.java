package org.example.coding.BasicCoding;

public class BitManupulation {

    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;
         //get bit
        if((bitMask & n) == 0){
            System.out.println("Bit is Zero");
        }
        else
            System.out.println("Bit is 1");

        //set bit
        int newNumber = bitMask | n;
        System.out.println(newNumber);

        //clear bit
        int notBitMask = ~(bitMask);
        System.out.println(notBitMask & n);

        //update bit

    }
}
