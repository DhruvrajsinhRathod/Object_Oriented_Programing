class car {
    String carName;
    int wheels;

    public void drive(String carName) {
        System.out.println(carName);
    }

    public void drive(int wheels) {
        System.out.println(wheels);
    }

    public void drive(String cName, int wheels) {
        System.out.println(carName + " " + wheels);
    }
}

public class Oops {
    public static void main(String[] args) {
        car c1 = new car();
        c1.drive(4);
        c1.drive("Volvo");
        c1.drive("Benz", 4);
    }
}