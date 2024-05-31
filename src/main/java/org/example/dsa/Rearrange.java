package org.example.dsa;

import java.util.Arrays;

public class Rearrange {
    //You are given an array of 0s and 1s in random order.
    // Segregate 0s on left side and 1s on right side of the array [Basically you have to sort the array].
    // Traverse array only once.

    //Input array   =  [0, 1, 0, 1, 0, 0, 1, 1, 1, 0]
    //Output array =  [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]

    public static int[] reArrange(int[] arr){
        int start = 0 ;
        int end = arr.length - 1;
        while(start < end){
            if(arr[start] == 0){
                start ++;
                continue;
            }
            if(arr[end] == 1){
                end --;
                continue;
            }
            else{
                arr[start] = 0;
                arr[end] = 1;
                start ++ ;
                end --;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        Arrays.stream(Rearrange.reArrange(arr)).forEach(value -> System.out.print(value + " "));
    }
}
