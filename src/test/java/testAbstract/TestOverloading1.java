package testAbstract;

import org.example.oops.Polymorphism;

public class TestOverloading1 {
    public static void main(String[] args) {
        Polymorphism polymorphism = new Polymorphism();
        polymorphism.resign("Paytm Bank doob gya aur maine behati ganga mein haath dho liya","Ayush");
        polymorphism.resign(4,"OCL kabhi bhi doob sakta hai " ,"Kamaljeet");
        polymorphism.resign("OCL kabhi bhi doob sakta hai " ,"Ishita",4);
    }
}
