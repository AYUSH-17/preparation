package org.example.exception;

public class AssertioError {
    public static void main(String[] args) {
        int x = 10;
        assert  x == 20 : "X is not equal to 10";
        System.out.println("Assertion failed");
    }


}
