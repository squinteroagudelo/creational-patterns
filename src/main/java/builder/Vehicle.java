package builder;

public class Vehicle {
    private String brand;
    private String model;
    private String type;
    private String engine;
    private int doors;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "\n\tBrand = " + brand +
                "\n\tModel = " + model +
                "\n\tType = " + type +
                "\n\tEngine = " + engine +
                "\n\tDoors = " + doors + "\n";
    }
}
