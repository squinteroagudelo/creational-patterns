package factory;

public class PriceEUR implements Price {
    @Override
    public double getPrice() {
        return 0.86;
    }

    @Override
    public String getCurrency() {
        return "EUR";
    }
}
