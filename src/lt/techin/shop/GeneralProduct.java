package lt.techin.shop;

public class GeneralProduct extends Product {

    double taxRate = 0.21;

    public GeneralProduct(String name, double netPrice) {
        super(name, netPrice);
    }

    @Override
    public double getGrossPrice() {
        return this.getNetPrice() * (1 + taxRate);
    }

}
