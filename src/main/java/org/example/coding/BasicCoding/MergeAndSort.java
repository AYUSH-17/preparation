package org.example.coding.BasicCoding;

import java.util.Arrays;

public class MergeAndSort {

    public static void merge(int[] arr1 , int[]arr2){
        for(int i = 0 ; i<arr1.length ; i++){
            for(int j = 0 ; j < arr2.length ; j++){
                if(arr1[i] >= arr2[j])
                    swap(arr1,arr2,i,j);
            }
        }
        Arrays.stream(arr1).forEach(e -> System.out.print(" "+e));
        Arrays.sort(arr2);
       // System.out.println();
        Arrays.stream(arr2).forEach(e -> System.out.print(" "+e));
    }

    public static void swap(int[] arr1, int[] arr2, int i , int j){
        int temp = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,10};
        int[] arr2 ={0,2,6,8,9};
                merge(arr1,arr2);
    }
}
