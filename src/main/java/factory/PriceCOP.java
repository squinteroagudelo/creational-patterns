package factory;

public class PriceCOP implements Price {
    @Override
    public double getPrice() {
        return 3701.88;
    }

    @Override
    public String getCurrency() {
        return "COP";
    }
}
