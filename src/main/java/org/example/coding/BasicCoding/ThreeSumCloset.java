package org.example.coding.BasicCoding;

import java.lang.reflect.Array;
import java.util.*;

public class ThreeSumCloset {
    public int threeSumCloset(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];
        int n = nums.length;
        int minDiff = Math.abs(target - closestSum);

        for(int i = 0 ; i<n-2 ; i++){
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                int diff = Math.abs(target - sum);

                if(diff<minDiff){
                    minDiff = diff;
                    closestSum = sum;
                }
                if (sum < target)
                    j++;
                else
                    k--;
            }
        }
        return closestSum;
    }
    public static void main(String[] args) {
        int[] arr = {-1, 2, 1, -4};
        ThreeSumCloset threeSum = new ThreeSumCloset();
        System.out.println(threeSum.threeSumCloset(arr,1));
    }
}
