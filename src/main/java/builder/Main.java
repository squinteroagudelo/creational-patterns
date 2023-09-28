package builder;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new CarBuilder("Ferrari")
                .setModel("488 GTB")
                .setType("Sports")
                .setEngine("V8")
                .setDoors(2)
                .build();

        System.out.println("car: " + car);
    }
}
