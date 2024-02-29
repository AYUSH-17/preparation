package org.example.coding.BasicCoding;

public class Fibonacci {
    public static void fibonacciSeries(int n){

        int prev = 0;
        int next = 1;
        int fibNumber;

        System.out.println("Fibonacci Series of " + n + ":");
        System.out.print(prev + " ");
        for(int i = 1 ; i<=n ; i++){
            fibNumber = prev + next;
            prev = next;
            next = fibNumber;
            System.out.print(prev + " ");
        }
    }

    //Recursion
   static int fibonacci(int num) {
        if (num == 1 || num == 2) {
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static void main(String[] args) {
        fibonacciSeries(10);
        System.out.println();
        System.out.println(fibonacci(10));
    }
}
