package org.example.coding.ds;

import java.util.Arrays;

public class DStack {

    int capacity = 5;
    int[] arr = new int[capacity];
    int top = 0;
    public  void push(int data){
        if(size()==capacity)
            expand();
            arr[top] = data;
            top++;
    }
    public int size(){
        return top;
    }

    public void expand(){
         int length = size();
         int[] newArr = new int[capacity*2];
         System.arraycopy(arr,0,newArr,0,length);
         arr = newArr;
         capacity *=2;
    }

    public void shrink(){
        int length = size();
        if(length<= (capacity/2)/2)
            capacity = capacity/2;
        int[] newArr = new int[capacity];
        System.arraycopy(arr,0,newArr,0,length);
        arr = newArr;
    }

    public int pop(){
        int data = 0;
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else {
            top--;
            data = arr[top];
            arr[top] = 0;
            shrink();
        }
        return data;
    }

    public boolean isEmpty(){
        return top<=0;
    }

    public void show(){
        Arrays.stream(arr).forEach(e -> System.out.print(e +" "));
    }

    public static void main(String[] args) {
        DStack dStack = new DStack();
        dStack.push(1);
        dStack.push(1);
        dStack.push(1);
        dStack.push(1);
        dStack.push(1);
        dStack.push(1);
        dStack.show();
        System.out.println();
        dStack.pop();
        dStack.pop();
        dStack.pop();
        dStack.pop();
        dStack.pop();
        dStack.show();
    }
}
