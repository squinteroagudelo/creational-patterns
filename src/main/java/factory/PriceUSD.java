package factory;

public class PriceUSD implements Price {
    @Override
    public double getPrice() {
        return 0.91;
    }

    @Override
    public String getCurrency() {
        return "USD";
    }
}
