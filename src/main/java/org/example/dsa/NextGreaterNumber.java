package org.example.dsa;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterNumber {
    private  int[] fetchNextGreaterNumber(int[] arr){
        Stack<Integer> stack = new Stack<>();

        int len = arr.length;
        int[] newArray = new int[len];

        for(int i = len-1  ; i>=0 ; i--){

            //To remove the element from top if top is less than current number
            while(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }

            //to check if there is number in stack is greater than current number
            if(stack.isEmpty()){
                newArray[i] = -1;
            }
            //storing current number to stack
            else {
                newArray[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 4, 10, 2, 5};
        NextGreaterNumber ob = new NextGreaterNumber();
        Arrays.stream(ob.fetchNextGreaterNumber(arr)).forEach(value -> System.out.print(value + " "));
    }
}
