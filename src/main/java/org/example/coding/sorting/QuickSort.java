package org.example.coding.sorting;

import java.util.Arrays;

public class QuickSort {

    public static int partition(int[] arr,int low , int high){
        int pivot = arr[high];
        int i = low -1 ;

        for(int j = low ; j< high ; j++){
            if(pivot >= arr[j]){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);

        return i+1;
    }

    static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
    public static void quickSort(int[] arr,int low, int high){
        if (arr.length < 1) {
            System.out.println("\n" + "Empty Array");
            return;
        }

        if(low<high) {
            int index = partition(arr, low, high);
            quickSort(arr, low, index - 1);
            quickSort(arr, index + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,4,1,4,6,4,8,9,3,4,6};
        System.out.println("\n" + "Arrays Before Sorting");
        Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
        quickSort(arr,0, arr.length-1);
        System.out.println("\n" + "Arrays After Sorting");
        Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
        // Test 1: Array with random elements
       /* int[] arr1 = {4, 2, 1, 6, 3, 5};
        quickSort(arr1,0, arr.length-1);

        // Test 2: Empty array
        int[] arr2 = {};
        quickSort(arr2,0, arr.length-1);

        // Test 3: Array already sorted in ascending order
        int[] arr3 = {1, 2, 3, 4, 5};
        quickSort(arr3,0, arr.length-1);

        // Test 4: Array already sorted in descending order
        int[] arr4 = {5, 4, 3, 2, 1};
        quickSort(arr4,0, arr.length-1);

        // Test 5: Array with duplicate elements
        int[] arr5 = {4, 4, 1, 4, 6, 4, 8, 9, 3, 4, 6};
        quickSort(arr5,0, arr.length-1);

        // Test 6: Array with negative elements
        int[] arr6 = {-4, 7, -3, 0, -9, 5};
        quickSort(arr6,0, arr.length-1);*/
    }
}
