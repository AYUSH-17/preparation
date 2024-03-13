package org.example.coding.BasicCoding;

public class Recursion {

    public static void print1To5(int x){
        if(x==6)
            return ;
        System.out.println(x);
        print1To5(x+1);
    }

    public static void sumOfAp(int i, int n , int sum){
        if(i==n){
            sum +=i;
            System.out.println(sum);
            return;
        }
        sum +=i;
        sumOfAp(i+1,n,sum);
    }

    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        int factorialNMinusOne = factorial(n-1);
        int currentFactorial = n * factorialNMinusOne;
        return currentFactorial;
    }

    static int fibonacci(int num) {
        if (num == 1 || num == 2) {
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static int xToPowerN(int x, int n){
        if(x==0)
            return 0;
        if(n==0)
            return 1;
        int calculatePower1 = xToPowerN(x,n-1);
        int xPower = x *calculatePower1;
        return xPower;
    }

    public static int calcPower(int x, int n){
        if(x==0)
            return 0;
        if(n==0)
            return 1;
        if(n%2==0){
           return calcPower(x,n/2) * calcPower(x,n/2);
        }
        else{
            return calcPower(x,n/2) * calcPower(x,n/2) * x;
        }
    }

    public static void main(String[] args) {
        //print1To5(1);
        //sumOfAp(1,5,0);
        //System.out.println(factorial(3));
        System.out.println(xToPowerN(2,1));
     }
}
