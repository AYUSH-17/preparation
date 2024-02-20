package testAbstract;


import org.example.oops.A;
import org.example.oops.B;

public class AbstractTest1 {
    public static void main(String[] args) {

        A obj1 =  new A();
        obj1.abstractMethod();

        B obj2 = new B();
        obj2.abstractMethod();
    }
}
