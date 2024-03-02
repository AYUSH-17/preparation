package org.example.coding.BasicCoding;

import java.util.*;

public class ThreeSum {

    //Brute Force
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

    //Optimal Solution

    public List<List<Integer>> optimalThreeSum(int[] nums){

        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0 ; i< nums.length-2; i++){
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum==0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
                else if(sum < 0)
                    j++;
                else
                    k--;
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        ThreeSum threeSum = new ThreeSum();
        System.out.println(threeSum.optimalThreeSum(arr));
    }
}
