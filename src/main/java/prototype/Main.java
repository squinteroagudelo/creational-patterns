package prototype;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Ferrari";
        car.model = "488 GTB";
        car.doors = 2;

        System.out.println("Car: brand = " + car.brand + ", model = " + car.model + ", doors = " + car.doors);

        try {
            Car clone = car.cloneCar();
            clone.model = "Any model";
            System.out.println("Car: brand = " + clone.brand + ", model = " + clone.model + ", doors = " + clone.doors);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can´t clone car. Caused by: " + e.getMessage());
        }
    }
}
