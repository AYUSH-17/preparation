package org.example.dsa;

import java.util.Arrays;
import java.util.HashMap;

//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].


// First loop
// arr[0] = 2 , i = 0
// diff = 9 -2 = 7
// if condition false
// map = {2,0}

// Second loop
// arr[1] = 7 , i = 1
// diff = 9 - 7 = 2
// if condition true
// map = [
// {2,0} ]

public class TwoSum {
    public static int[] twoSum(int[] nums, int target){
        int diff = 0 ;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i<= nums.length-1 ; i++){
            diff = target - nums[i];

            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }


    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 9;

        Arrays.stream(TwoSum.twoSum(nums, target)).forEach(value -> System.out.print(value + " "));
    }
}
