package org.example.coding.twoPointer;

import java.util.Arrays;

public class FetchPairOfSum {
    public int fetchPairOfSum(int[] arr , int k){
        Arrays.sort(arr);
        int len = arr.length;
        int start = 0, end = len - 1;
        int pairCount = 0;
        if (len < 2) {
            return 0;
        }

        else {
            while (start <= end) {

                if (arr[start] + arr[end] < k)
                    start++;
                else if (arr[start] + arr[end] > k)
                    end--;

                else {

                    int x = arr[start], startIndex = start;
                    while (start < end && arr[start] == x) {
                        start++;
                    }
                    int y = arr[end], endIndex  = end;
                    while (end >= start && arr[end] == y) {
                        end--;
                    }
                   /* System.out.println("startIndex : " + startIndex);
                    System.out.println("endIndex : " + endIndex);
                    System.out.println("start : " + start);
                    System.out.println("end : " + end);*/

                    if(x==y)
                    {
                        int temp = start - startIndex + endIndex - end -1;
                        pairCount  = pairCount + (temp * (temp + 1)) / 2;
                    }
                    else{
                        pairCount = pairCount + (start - startIndex ) * (endIndex - end);
                    }
                }
            }
            return pairCount;
        }

    }



    public static void main(String[] args) {
        FetchPairOfSum ob   = new FetchPairOfSum();
        int[] a = {1,4,4,5,5,5,6,6,1,1};
        int[] a1 = {1,1,1,4,4,5,5,5,6,6};

        int k = 11;
        System.out.println(ob.fetchPairOfSum(a,k));


        int[] arr1 = {1, 3, 5, 2, 4, 6};
        int k1 = 7;
        System.out.println("Test case 1: " + ob.fetchPairOfSum(arr1, k1)); // Output should be 3


        // Test case 2: Array with no pairs summing up to k
        int[] arr2 = {1, 2, 3, 4, 5};
        int k2 = 10;
        System.out.println("Test case 2: " + ob.fetchPairOfSum(arr2, k2)); // Output should be 0


        // Test case 3: Array with all elements equal, sum is multiple of each element
        int[] arr3 = {2, 2, 2, 2, 2, 2};
        int k3 = 4;
        System.out.println("Test case 3: " + ob.fetchPairOfSum(arr3, k3)); // Output should be 15


        // Test case 4: Empty array
        int[] arr4 = {};
        int k4 = 5;
        System.out.println("Test case 4: " + ob.fetchPairOfSum(arr4, k4)); // Output should be 0


        // Test case 5: Array with only one element
        int[] arr5 = {5};
        int k5 = 5;
        System.out.println("Test case 5: " + ob.fetchPairOfSum(arr5, k5)); // Output should be 0

        int[] arr6 = {1,2,2,1};
        int k6 = 6;
        System.out.println("Test case 6: " + ob.fetchPairOfSum(arr6, k6)); // Output should be 0
    }
}
