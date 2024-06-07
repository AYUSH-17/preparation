package org.example.exception;

public class ThrowException {
    public static void main(String[] args) {
        int age = 5;
        if(age < 6){
            try {
                throw new IllegalArgumentException("age can not be less than 5");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
