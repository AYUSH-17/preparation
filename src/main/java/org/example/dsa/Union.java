package org.example.dsa;

import java.util.HashSet;
import java.util.Set;

public class Union {

    public Set<Integer> getUnion(int[] arr1, int[] arr2){

        Set<Integer> set = new HashSet<>();

        for(int item : arr1){
            set.add(item);
        }

        for(int item : arr2){
            set.add(item);
        }

        return set;
    }

    public Set<Integer> getIntersection(int[] arr1, int[] arr2){

        Set<Integer> set = new HashSet<>();

        Set<Integer> intersection = new HashSet<>();

        for(int item : arr1){
            set.add(item);
        }

        for(int item : arr2){
            if(set.contains(item)){
                intersection.add(item);
            }

        }
        return intersection;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {3, 4, 5, 6};

        Union union = new Union();
        union.getUnion(array1,array2).stream().forEach(integer -> System.out.print(integer + " "));
        System.out.println();
        union.getIntersection(array1,array2).stream().forEach(integer -> System.out.print(integer + " "));
    }
}
