package org.example.coding.sorting;

import java.util.Arrays;

public class MergeSort {

   public static void mergeSort(int[] arr, int left , int right){
      if(left<right){
         int mid = (left + right)/2;
         mergeSort(arr, left, mid);
         mergeSort(arr,mid+1,right);
         merge(arr,left,mid,right);
      }
   }

   private static void merge(int[] arr, int left, int mid, int right) {
      int n1 = mid - left + 1;
      int n2 = right - mid;

      int[] leftArray = new int[n1];
      int[] rightArray = new int[n2];

      for(int x = 0 ; x<n1 ; x++){
         leftArray[x] = arr[left+x];
      }

      for(int y = 0 ; y<n2 ;y++){
         rightArray[y] = arr[mid +1+y];
      }

      int i = 0;
      int j = 0;
      int k = left;

      while(i<n1 && j < n2){
         if(leftArray[i] <= rightArray[j]){
            arr[k] = leftArray[i];
            i++;
         }
         else{
            arr[k] = rightArray[j];
            j++;
         }
         k++;
      }

      while(i<n1){
         arr[k] = leftArray[i];
         i++;
         k++;
      }

      while(j<n2){
         arr[k] = rightArray[j];
         j++;
         k++;
      }
   }

   public static void main(String[] args) {
      int[] arr = {4, 2, 1, 6, 3, 5};
      Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
      System.out.println();
      mergeSort(arr,0, arr.length-1);
      Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
   }
}
