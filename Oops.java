class A {
    String carName = "Volvo";
    int wheels = 4;

    public void carPrinter() {
        System.out.println(carName + " " + wheels);
    }
}

class B extends A {
    public void carPrinterB() {
        System.out.println(carName + " is new car: " + wheels);
    }
}

public class Oops {
    public static void main(String[] args) {
        A a1 = new A();
        a1.carPrinter();
        B b1 = new B();
        b1.carPrinterB();
    }
}