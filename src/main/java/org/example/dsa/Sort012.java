package org.example.dsa;

import java.util.Arrays;

public class Sort012 {
    //1 {0,1,0,0,1,1,2,2,1,0,2} high = 9 mid = 0  low = 0
    //2 {0,1,0,0,1,1,2,2,1,0,2} high = 9 mid = 1  low = 1
    //3 {0,1,0,0,1,1,2,2,1,0,2} high = 9 mid = 2  low = 1
    //4 {0,0,1,0,1,1,2,2,1,0,2} high = 9 mid = 3  low = 2
    //5 {0,0,0,1,1,1,2,2,1,0,2} high = 9 mid = 4  low = 3
    //6 {0,0,0,1,1,1,2,2,1,0,2} high = 9 mid = 5  low = 3
    //7 {0,0,0,1,1,1,2,2,1,0,2} high = 9 mid = 6  low = 3
    //8 {0,0,0,1,1,1,0,2,1,2,2} high = 8 mid = 6  low = 3
    //9 {0,0,0,0,1,1,1,2,1,2,2} high = 8 mid = 7  low = 4
    //10 {0,0,0,0,1,1,1,1,2,2,2} high = 7 mid = 7  low = 4

    public static int[] sort(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }

        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,0,0,1,1,2,2,1,0,0};
       Arrays.stream(sort(arr)).forEach(value -> System.out.print(value + " "));
    }
}
