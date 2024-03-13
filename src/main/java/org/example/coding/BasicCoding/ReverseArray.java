package org.example.coding.BasicCoding;

import java.util.Arrays;

public class ReverseArray {

    public static int[] revArray(int[] arr){

        for(int i = 0 ; i< arr.length/2;i++){
            int left = i;
            int right = arr.length - 1 -i;
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,5,4,3,2,2,1};
        Arrays.stream(revArray(arr)).forEach(e -> System.out.print(e + " "));
    }
}
