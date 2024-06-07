package org.example.dsa;

public class RemoveDuplicates {
    //Remove duplicates from sorted array
    //Input: nums = [1,1,2]
    //Output: 2, nums = [1,2,_]

    public static int removeDuplicate(int[] arr){
        int slow = 0 ;
        for(int fast = 1 ; fast< arr.length ; fast++){
            if(arr[slow] != arr[fast]){
                slow++;
                arr[slow] = arr[fast];
            }
        }
        return slow + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(RemoveDuplicates.removeDuplicate(arr));
    }

}
