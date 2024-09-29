package lt.techin.shop;

import java.text.DecimalFormat;

public abstract class Product {

    private String name;
    private double netPrice;
    private double rateCHF = 0.94;

    public Product(String name, double netPrice) {
        this.name = name;
        this.netPrice = netPrice;
    }

    public abstract double getGrossPrice();

    public double getGrossPriceCHF() {
        return getGrossPrice() * rateCHF;
    }

    @Override
    public String toString() {
        DecimalFormat f = new DecimalFormat("##.00");
        return "\n" + name + ": net price " + f.format(netPrice) + " EUR, gross price " + f.format(getGrossPrice()) + " EUR / " + f.format(getGrossPriceCHF()) + " CHF";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(double netPrice) {
        this.netPrice = netPrice;
    }

    public double getRateCHF() {
        return rateCHF;
    }

    public void setRateCHF(double rateCHF) {
        this.rateCHF = rateCHF;
    }
}
