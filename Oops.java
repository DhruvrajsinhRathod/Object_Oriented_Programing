class car {
    private String carName;
    private int wheels;

    public void carNameSetter(String c) {
        carName = c;
    }

    public void wheelsSetter(int w) {
        wheels = w;
    }

    public void carNamePrinter() {
        System.out.println(carName);
    }

    public void wheelsPrinter() {
        System.out.println(wheels);
    }
}

public class Oops {
    public static void main(String[] args) {
        car c1 = new car();
        c1.carNameSetter("Tesla");
        c1.wheelsSetter(5);
        // c1.carName = "volvo";
        // c1.wheels = 4;
        c1.carNamePrinter();
        c1.wheelsPrinter();
    }
}