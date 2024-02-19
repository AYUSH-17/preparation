package org.example.oops;

public class Polymorphism {

   public void resign(int time , String reason ,String name){
       System.out.println("Name : "+ name);
       System.out.println("Reason : "+reason);
       System.out.println("Time : Kabhi bhi nikal sakte hai , waise "+ time +" mahina baki hai "+"\n");

    }
    public void resign( String reason ,String name ,int time ){
        System.out.println("Name : "+ name);
        System.out.println("Reason : "+reason);
        System.out.println("Time  : bas jo bhi tha yahi tha abb mai "+ time + " mahine mein chali jaaungi "+"\n");
    }
    public void resign(String reason , String name){
        System.out.println("Name : "+ name);
        System.out.println("Reason : "+reason);
        System.out.println("Time : "+ "Beta bahut hee kam time hai , pehali fursat mein nikal le"+"\n");


    }
}
