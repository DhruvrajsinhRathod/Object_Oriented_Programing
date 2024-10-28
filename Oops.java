abstract class A {
    abstract public void car();
}

class B extends A{
    public void car(){
        System.out.println("Drives a car!");
    }
}

public class Oops {
    public static void main(String[] args) {
        B a1 = new B();
        a1.car();
    }
}