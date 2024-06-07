package org.example.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionExample {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("example.txt"));
            String line ;
            while((line = reader.readLine())!=null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
           try {
               if(reader.readLine()!=null)
                   reader.close();
           } catch (IOException e) {
               System.err.println("An error occurred while closing the file: " + e.getMessage());
               e.printStackTrace();
           }
        }
    }
}
