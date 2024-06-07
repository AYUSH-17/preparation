package org.example.dsa;

import java.util.Arrays;

public class MinMaxArray {

    public static int[] maxMin(int[] arr) {

        int len = arr.length;
        if (len == 0) {
            throw new IllegalArgumentException("Array must not be null");
        }

        int max = arr[0];
        int min = arr[0];
        int i = 1;

        if (len % 2 == 0) {
            i = 0;
        }

        while (i < len - 1) {
            if (arr[i] > arr[i + 1]) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i + 1] < min) {
                    min = arr[i + 1];
                }

            } else {
                if (arr[i + 1] > max) {
                    max = arr[i + 1];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            i += 2;
        }

        return new int[]{max, min};
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 7, 4, 7, -1};
        int[] arr1 = {};
        Arrays.stream(maxMin(arr)).forEach(value -> System.out.print(value + " "));
    }
}
