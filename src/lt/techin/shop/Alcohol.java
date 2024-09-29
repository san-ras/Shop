package lt.techin.shop;

public class Alcohol extends Product {

    private final double liters;
    private final double percentageOfAlcohol;
    private final double taxRate = 0.21;
    private final double exciseOver15 = 1.26;
    private final double exciseUnder15 = 0.89;

    public Alcohol(String name, double netPrice, double liters, double percentageOfAlcohol) {
        super(name, netPrice);
        this.liters = liters;
        this.percentageOfAlcohol = percentageOfAlcohol;
    }

    @Override
    public double getGrossPrice() {
        if (percentageOfAlcohol >= 15) {
            return (Math.ceil(liters) * exciseOver15 + ((1 + taxRate) * this.getNetPrice()));
        } else {
            return (Math.ceil(liters) * exciseUnder15 + ((1 + taxRate) * this.getNetPrice()));
        }

    }

}
