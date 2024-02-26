package org.example.coding.searching;

public class BinarySearch {

    public static int binarySearch(int[] arr , int target){
        int left = 0 ;
        int right = arr.length -1 ;
        int mid =0;
        while(left<=right){
            mid =(left + right)/2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] > target)
                right = mid - 1 ;
            else
                left = mid + 1 ;
        }
        return -1;
    }

    public static void main(String[] args) {
        // Test 1: Target present in the array
        int[] arr1 = {1, 3, 5, 7, 9, 11, 13};
        int target1 = 7;
        System.out.println("Index of " + target1 + ": " + binarySearch(arr1, target1)); // Should print: 3

        // Test 2: Target not present in the array
        int[] arr2 = {2, 4, 6, 8, 10};
        int target2 = 5;
        System.out.println("Index of " + target2 + ": " + binarySearch(arr2, target2)); // Should print: -1

        // Test 3: Target at the beginning of the array
        int[] arr3 = {1, 2, 3, 4, 5};
        int target3 = 1;
        System.out.println("Index of " + target3 + ": " + binarySearch(arr3, target3)); // Should print: 0

        // Test 4: Target at the end of the array
        int[] arr4 = {10, 20, 30, 40, 50};
        int target4 = 50;
        System.out.println("Index of " + target4 + ": " + binarySearch(arr4, target4)); // Should print: 4

        // Test 5: Target present multiple times in the array
        int[] arr5 = {1, 2, 2, 3, 4, 5, 5};
        int target5 = 2;
        System.out.println("Index of " + target5 + ": " + binarySearch(arr5, target5)); // Can print any index where 2 is present
    }
}
