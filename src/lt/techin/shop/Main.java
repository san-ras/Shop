package lt.techin.shop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();

        while (true) {
            System.out.println("Please enter the product name (empty to stop):");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            System.out.println("Please enter the net price:");
            double netPrice = Double.parseDouble(scanner.nextLine());
            System.out.println("Please enter the product group: A for alcohol, W for wine, G for general products and M for medicine:");
            String group = scanner.nextLine();
            double liters = 0;
            double percentageOfAlcohol = 0;

            if (group.equals("A") || group.equals("W")) {
                System.out.println("Please enter the capacity (in liters)");
                liters = Double.parseDouble(scanner.nextLine());
                System.out.println("Please enter the % of alcohol:");
                percentageOfAlcohol = Double.parseDouble(scanner.nextLine());
            }
            switch (group) {
                case "A" -> shop.add(new Alcohol(name, netPrice, liters, percentageOfAlcohol));
                case "W" -> shop.add(new Wine(name, netPrice, liters, percentageOfAlcohol));
                case "G" -> shop.add(new GeneralProduct(name, netPrice));
                case "M" -> shop.add(new Medicine(name, netPrice));
                default -> {
                }
            }
        }

        shop.add(new Alcohol("Absolut", 20, 0.5, 35));
        shop.add(new Wine("Riesling", 15, 1.5, 15));
        shop.add(new GeneralProduct("Akvile", 1));
        shop.add(new Medicine("Ibuprofen", 3));
        shop.add(new Medicine("Ibumetin", 2.5));

        System.out.println("Total products in shop: " + shop.countProducts());
        System.out.println(shop.getProducts());

        shop.remove("Ibumetin");

        System.out.println("Total products in shop: " + shop.countProducts());
        System.out.println(shop.getProducts());

    }
}
