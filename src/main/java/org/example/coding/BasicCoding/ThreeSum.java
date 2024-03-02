package org.example.coding.BasicCoding;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0 ; i<nums.length ; i++){
            for(int j = i+1 ; j< nums.length ; j++){
                int target = -(nums[i] + nums[j]);
                if(set.contains(target) && !result.contains(Arrays.asList(nums[i],nums[j],target))){
                    result.add(Arrays.asList(nums[i],nums[j],target));
                }
                set.add(nums[j]);
            }
            set.clear();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        ThreeSum threeSum = new ThreeSum();
        System.out.println(threeSum.threeSum(arr));
    }
}
