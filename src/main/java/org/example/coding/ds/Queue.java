package org.example.coding.ds;

import java.util.Arrays;

public class Queue {
    int queue[] = new int[5];

    public int getSize() {
        return size;
    }

    int size;
    int front = 0;
    int rear = 0;
    public void enQueue(int data){
        if(!isFull()) {
            queue[rear] = data;
            rear = (rear + 1) % 5;
            size++;
        }
        else {
            System.out.println("Queue is FULl.");
        }
    }

    public void deQueue(){
        if(!isEmpty()) {
            front = (front + 1) % 5;
            size--;
        }
        else {
            System.out.println("Queue is Empty.");
        }
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean isFull(){
        return getSize()==5;
    }
    public void show(){
        for(int i = 0 ; i<size ;i++){
            System.out.print(queue[(front + i)%5]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue queue1 = new Queue();
        queue1.enQueue(14);
        queue1.enQueue(13);
        queue1.enQueue(12);
        queue1.enQueue(11);
        queue1.deQueue();
        queue1.enQueue(15);
        queue1.enQueue(16);
        queue1.enQueue(17);
        queue1.enQueue(18);
        queue1.show();
        System.out.println(queue1.isEmpty());
        System.out.println(queue1.isFull());
        System.out.println(queue1.getSize());
    }
}
