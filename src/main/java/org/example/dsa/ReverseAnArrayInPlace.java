package org.example.dsa;

import java.util.Arrays;

public class ReverseAnArrayInPlace {
    public static int[] rev(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
        return arr;
    }

    public static void swap(int[] arr , int pos1 , int pos2){
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        Arrays.stream(ReverseAnArrayInPlace.rev(arr)).forEach(e -> System.out.print(e + " "));
    }
}
