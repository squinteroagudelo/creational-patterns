package prototype;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Ferrari";
        car.model = "488 GTB";
        car.doors = 2;

        System.out.println("car: brand = " + car.brand + ", model = " + car.model + ", doors = " + car.doors);

        Car clone = car.clone();
        clone.model = "Another model";
        System.out.println("car: brand = " + clone.brand + ", model = " + clone.model + ", doors = " + clone.doors);
    }
}