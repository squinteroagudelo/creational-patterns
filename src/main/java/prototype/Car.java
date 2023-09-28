package prototype;

public class Car {
    public String brand;
    public String model;
    public int doors;

    public Car clone() {
        Car car = new Car();
        car.brand = brand;
        car.model = model;
        car.doors = doors;
        return car;
    }
}
