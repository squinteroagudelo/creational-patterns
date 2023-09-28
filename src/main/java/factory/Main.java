package factory;

public class Main {
    public static void main(String[] args) {
        PriceFactory price;

        price = new PriceFactory("usa");
        System.out.println("United States: " + price.getPrice());

        price = new PriceFactory("colombia");
        System.out.println("Colombia: " + price.getPrice());

        price = new PriceFactory("spain");
        System.out.println("Spain: " + price.getPrice());
    }
}
