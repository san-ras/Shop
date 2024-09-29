package lt.techin.shop;

public class Wine extends Product {

    private final double liters;
    private final double percentageOfAlcohol;
    private final double taxRate = 0.21;
    private final double exciseUnder8_5 = 0.28;
    private final double exciseOver8_5 = 0.72;


    public Wine(String name, double netPrice, double liters, double percentageOfAlcohol) {
        super(name, netPrice);
        this.liters = liters;
        this.percentageOfAlcohol = percentageOfAlcohol;
    }

    @Override
    public double getGrossPrice() {
        if (percentageOfAlcohol >= 15) {
            return (Math.ceil(liters) * exciseOver8_5 + ((1 + taxRate) * this.getNetPrice()));
        } else {
            return (Math.ceil(liters) * exciseUnder8_5 + ((1 + taxRate) * this.getNetPrice()));
        }

    }

}
