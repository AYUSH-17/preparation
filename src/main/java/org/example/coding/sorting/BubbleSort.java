package org.example.coding.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr){

        if(arr.length < 1) {
            System.out.println("\n"+"Empty Array");
            return;
        }


        System.out.println("\n"+"Arrays Before Sorting");
        Arrays.stream(arr).forEach(e -> System.out.print(e + " "));

        for(int i = 0 ; i<arr.length ;i++){
            for(int j = 0 ; j< arr.length - i -1 ; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("\n"+"Arrays After Sorting");
        Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
    }

    public static void main(String[] args) {
        int[] arr = {4,4,1,4,6,4,8,9,3,4,6};
        bubbleSort(arr);

        // Test 1: Array with random elements
        int[] arr1 = {4, 2, 1, 6, 3, 5};
        bubbleSort(arr1);

        // Test 2: Empty array
        int[] arr2 = {};
        bubbleSort(arr2);

        // Test 3: Array already sorted in ascending order
        int[] arr3 = {1, 2, 3, 4, 5};
        bubbleSort(arr3);

        // Test 4: Array already sorted in descending order
        int[] arr4 = {5, 4, 3, 2, 1};
        bubbleSort(arr4);

        // Test 5: Array with duplicate elements
        int[] arr5 = {4, 4, 1, 4, 6, 4, 8, 9, 3, 4, 6};
        bubbleSort(arr5);

        // Test 6: Array with negative elements
        int[] arr6 = {-4, 7, -3, 0, -9, 5};
        bubbleSort(arr6);
    }
}
