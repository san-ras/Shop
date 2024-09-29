package lt.techin.shop;

public class Medicine extends Product {

    double taxRate = 0.09;


    public Medicine(String name, double netPrice) {
        super(name, netPrice);
    }

    @Override
    public double getGrossPrice() {
        return this.getNetPrice() * (1 + taxRate);
    }

}
