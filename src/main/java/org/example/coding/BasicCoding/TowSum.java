package org.example.coding.BasicCoding;

import java.util.HashMap;

class TowSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i< nums.length ; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        TowSum towSum = new TowSum();

        // Test case 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = towSum.twoSum(nums1, target1);
        System.out.println("Test Case 1:");
        System.out.println("Indices: [" + result1[0] + ", " + result1[1] + "]");

        // Test case 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = towSum.twoSum(nums2, target2);
        System.out.println("Test Case 2:");
        System.out.println("Indices: [" + result2[0] + ", " + result2[1] + "]");

        // Test case 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = towSum.twoSum(nums3, target3);
        System.out.println("Test Case 3:");
        System.out.println("Indices: [" + result3[0] + ", " + result3[1] + "]");

        // Test case 3
        int[] nums4 = {3, 3};
        int target4 = 5;
        int[] result4 = towSum.twoSum(nums4, target4);
        System.out.println("Test Case 4:");
    }
}
