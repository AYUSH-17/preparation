package org.example.coding;

import java.util.Arrays;

public class RemoveDuplicateItemsFromAnSortedArray {
    int removeDuplicate(int[] arr){
        Arrays.sort(arr);
        if(arr.length < 1)
            return 0;
        int i = 0;
        for(int j=1; j<arr.length ; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        RemoveDuplicateItemsFromAnSortedArray remove = new RemoveDuplicateItemsFromAnSortedArray();
        // Test cases 2D array
        int[][] testCases = {
                {1, 2, 3, 4, 5}, // No duplicates, already sorted
                {5, 4, 3, 2, 1}, // No duplicates, reverse order
                {1, 1, 1, 1, 1}, // All duplicates
                {1, 2, 2, 3, 4, 4, 5}, // Some duplicates, already sorted
                {4, 5, 4, 3, 2, 1, 1}, // Some duplicates, unsorted
                {}, // Empty array
                {1}, // Single element
                {2, 2, 3, 3, 3} // Multiple duplicates, already sorted
        };

        for (int[] testCase : testCases) {
            System.out.println("Original array: " + Arrays.toString(testCase));
            int newLength = remove.removeDuplicate(testCase);
            int[] newArr = Arrays.copyOfRange(testCase, 0, newLength);
            System.out.println("Array after removing duplicates: " + Arrays.toString(newArr) + "\n");
        }
    }
}
