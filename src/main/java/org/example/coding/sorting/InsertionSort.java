package org.example.coding.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        if (arr.length < 1) {
            System.out.println("\n" + "Empty Array");
            return;
        }

        System.out.println("\n" + "Arrays Before Sorting");
        Arrays.stream(arr).forEach(e -> System.out.print(e + " "));

        int size = arr.length;
        for(int i = 1 ; i<size ; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > key ){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }
        System.out.println("\n" + "Arrays After Sorting");
        Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
    }
    public static void main(String[] args) {
        int[] arr = {4,4,1,4,6,4,8,9,3,4,6};
        insertionSort(arr);

        // Test 1: Array with random elements
        int[] arr1 = {4, 2, 1, 6, 3, 5};
        insertionSort(arr1);

        // Test 2: Empty array
        int[] arr2 = {};
        insertionSort(arr2);

        // Test 3: Array already sorted in ascending order
        int[] arr3 = {1, 2, 3, 4, 5};
        insertionSort(arr3);

        // Test 4: Array already sorted in descending order
        int[] arr4 = {5, 4, 3, 2, 1};
        insertionSort(arr4);

        // Test 5: Array with duplicate elements
        int[] arr5 = {4, 4, 1, 4, 6, 4, 8, 9, 3, 4, 6};
        insertionSort(arr5);

        // Test 6: Array with negative elements
        int[] arr6 = {-4, 7, -3, 0, -9, 5};
        insertionSort(arr6);
    }
}
