package org.example.dsa;

import java.util.Arrays;
import java.util.Stack;

public class JustPreviousSmallerNumber {

    private int[] fetchJustSmallerNumber(int[] arr){

        Stack<Integer> stack = new Stack<>();

        int len = arr.length;
        int[] newArray = new int[len];

        for(int i = 0 ; i<len; i++){

            //to remove element from top , if top is greater than current  number
            while(!stack.isEmpty() && stack.peek() >= arr[i])
            {
                stack.pop();
            }

            //to check there is number in stack that is less than current number
            if(stack.isEmpty()){
              newArray[i] = -1;
            }
            //to fetch the smaller number as compare to current number  from stack
            else{
                newArray[i] = stack.peek();
            }
            //storing current number to stack
            stack.push(arr[i]);
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 4, 10, 2, 5};
        JustPreviousSmallerNumber ob = new JustPreviousSmallerNumber();
        Arrays.stream(ob.fetchJustSmallerNumber(arr)).forEach(value -> System.out.print(value + " "));
    }
}
