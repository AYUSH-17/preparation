package org.example.dsa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingNumber {
    public static int findMissingNumber(int[] arr, int n){
        int sum = (n*(n+1))/2;
        int loopSum = 0;

        for(int i = 0 ; i<arr.length ;i++){
            loopSum += arr[i];
        }


        return sum - loopSum;
    }

    public static List<Integer> findNMissingNumber(int[] arr , int n){

        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(Integer i : arr){
            set.add(i);
        }

        for(int i = 1 ; i<= n ; i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        System.out.println(findMissingNumber(new int[]{2,3,4,5} ,5));
        findNMissingNumber(new int[]{2,3} ,6).stream().forEach(e -> System.out.print(e + " "));
    }
}
