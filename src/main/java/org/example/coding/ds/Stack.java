package org.example.coding.ds;

import java.util.Arrays;

public class Stack {
    int[] arr = new int[5];
    int top = 0;
    public  void push(int data){
        if(top == 5){
            System.out.println("Stack is Full");
        }
        else {
            arr[top] = data;
            top++;
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else {
            top--;
            int data = arr[top];
            arr[top] = 0;
            System.out.println(data + " : is deleted");
            return data;
        }
        return -1;
    }

    public int peep(){
       int data = arr[top-1];
       return data;
    }

    public int size(){
        return top;
    }

    public boolean isEmpty(){
        return top<=0;
    }

    public void show(){
        Arrays.stream(arr).forEach(e -> System.out.println(e));
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        //System.out.println("value at TOP : "+stack.peep());
        System.out.println("Size of Stack is  : "+stack.size());
        stack.show();
    }
}
