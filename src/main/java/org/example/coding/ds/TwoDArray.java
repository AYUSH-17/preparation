package org.example.coding.ds;

import java.util.Arrays;

public class TwoDArray {
    static int[][] arr = {{1,9},{2,8},{3,7,8}};

    public static void main(String[] args) {
       // System.out.println(arr[1][1]);
        for(int[] row: arr){
            for(int column : row){
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
