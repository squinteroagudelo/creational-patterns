package builder;

public class CarBuilder {
    Vehicle vehicle;

    public CarBuilder(String brand){
        vehicle = new Vehicle();
        vehicle.setBrand(brand);
    }

    public CarBuilder setModel(String model){
        vehicle.setModel(model);
        return this;
    }

    public CarBuilder setType(String type){
        vehicle.setType(type);
        return this;
    }

    public CarBuilder setEngine(String engine){
        vehicle.setEngine(engine);
        return this;
    }

    public CarBuilder setDoors(int doors){
        vehicle.setDoors(doors);
        return this;
    }

    public Vehicle build(){
        return vehicle;
    }

    @Override
    public String toString() {
        return "CarBuilder{" +
                "vehicle=" + vehicle +
                '}';
    }
}
