package factory;

public class PriceFactory {
    Price price;
    private PriceFactory() {
    }

    public PriceFactory(String country) {
        if (country.equalsIgnoreCase("Spain")){
            price = new PriceEUR();
        } else if (country.equalsIgnoreCase("USA")){
            price = new PriceUSD();
        } else {
            price = new PriceCOP();
        }
    }

    public String getPrice() {
        return price.getPrice() + " " + price.getCurrency();
    }
}
