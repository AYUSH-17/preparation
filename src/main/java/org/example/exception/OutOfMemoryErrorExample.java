package org.example.exception;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        try {
            for (int i = 0; ; i++) {
                list.add(i);
            }
        }
        catch (OutOfMemoryError  e){
            System.out.println("Out Of Memory");
            e.printStackTrace();
        }
    }
}
