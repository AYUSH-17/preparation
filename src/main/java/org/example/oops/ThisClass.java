package org.example.oops;

public class ThisClass {
    private int num;

    public ThisClass(int num){
        this.num = num; // to refer instance variable of current class
    }

    public  ThisClass(){
        this(20);
    }

    public void methodWithThisArgument(ThisClass obj){
        System.out.println("METHOD WITH THIS ARGUMENT : "+obj.num);
    }

    public ThisClass getInstance(){
        return  this;    // returning current class instance
    }

    public static void main(String[] args) {
        ThisClass obj3 = new ThisClass();

        System.out.println("Calling constructor insid eanother constructor : "+ obj3.num);
        ThisClass obj1 = new ThisClass(10); // Initiating current class constructor
        System.out.println("Value on NUM : " +obj1.num);

        ThisClass obj2 = obj1.getInstance(); // returning current class instance
        System.out.println("Value of NUM using object 2 : "+obj2.num);

        obj1.methodWithThisArgument(obj1); //can be pass as argument in the method call

        //System.out.println(this.num);
    }

}
