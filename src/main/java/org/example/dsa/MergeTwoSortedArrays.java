package org.example.dsa;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2){
        int len1 = arr1.length;
        int len2 = arr2.length;
        int len3 = len1 + len2 ;

        int[] arr3 = new int[len3];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < len1  && j < len2){
            if(arr1[i] < arr2[j]){
                arr3[k] = arr1[i];
                i++;
            }
            else{
                arr3[k] = arr2[j];
                        j++;
            }
            k++;
        }

        while(i< len1){
            arr3[k] = arr1[i];
            i++;
            k++;
        }

        while(j< len2){
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        return arr3;
    }

   /* public static int[] merge2ArrayGapAlgo(int[] arr1 , int[] arr2){

    }*/

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {5,5,6,7,8,9};
        Arrays.stream(mergeTwoSortedArray(arr1, arr2)).forEach(value -> System.out.print(value + " "));
    }
}
