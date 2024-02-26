package org.example.coding;

import java.util.Arrays;

public class ContainerWithMostWater {
    int fetchArea(int[] arr){
        if(arr.length <2)
            return 0;
        int left = 0;
        int right = arr.length  -1 ;
        int length = 0;
        int maxArea = 0;
        while(left <right){
            length = right - left;
            int minHeight = Math.min(arr[left], arr[right]);
            int area = length * minHeight;
            maxArea = Math.max(maxArea, area);
            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        ContainerWithMostWater solver = new ContainerWithMostWater();

        // Test Case 1: Standard case
        int[] heights1 = {1,8,6,2,5,4,8,3,7};
        long[] heights12 = new long[23];
        System.out.println("Test Case 1 Result: " + solver.fetchArea(heights1)); // Expected: 49

        // Test Case 2: Edge case with two elements
        int[] heights2 = {1,1};
        System.out.println("Test Case 2 Result: " + solver.fetchArea(heights2)); // Expected: 1

        // Test Case 3: Increasing height
        int[] heights3 = {1,2,3,4,5};
        System.out.println("Test Case 3 Result: " + solver.fetchArea(heights3)); // Expected: 6

        // Test Case 4: Decreasing height
        int[] heights4 = {5,4,3,2,1};
        System.out.println("Test Case 4 Result: " + solver.fetchArea(heights4)); // Expected: 6

        // Test Case 5: All elements are the same height
        int[] heights5 = {3,3,3,3,3};
        System.out.println("Test Case 5 Result: " + solver.fetchArea(heights5)); // Expected: 12

        // Test Case 6: Empty array
        int[] heights6 = {};
        System.out.println("Test Case 6 Result: " + solver.fetchArea(heights6)); // Expected: 0

        // Test Case 7: Array with one element
        int[] heights7 = {1};
        System.out.println("Test Case 7 Result: " + solver.fetchArea(heights7)); // Expected: 0

        System.out.println(Arrays.equals(heights7,heights7));

    }
}
