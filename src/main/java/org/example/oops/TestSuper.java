package org.example.oops;

class Parent {
    String name;

    public Parent() {
        System.out.println("Parent class constructor");
    }

    public Parent(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name in Parent: " + name);
    }
}

class Child extends Parent {
    String name;

    public Child() {
        super("John"); // Call Parent(String name) constructor
        System.out.println("Child class constructor");
    }

    public Child(String name) {
        // Here, super() is used to call the Parent() constructor.
        super(); // Even if you don't write this, Java adds it implicitly.
        this.name = name;
    }

    void display() {
        System.out.println("Name in Child: " + name);
        super.display(); // Call display() method of Parent
    }

    void displayName() {
        // Access parent class instance variable using super
        System.out.println("Parent name: " + super.name);
        System.out.println("Child name: " + name);
    }
}

public class TestSuper {
    public static void main(String[] args) {
        Child child1 = new Child();
        child1.display();

        Child child2 = new Child("Doe");
        child2.displayName();
    }
}


