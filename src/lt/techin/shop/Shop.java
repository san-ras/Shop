package lt.techin.shop;

import java.util.ArrayList;

public class Shop {

    private final ArrayList<Product> products;

    public Shop() {
        this.products = new ArrayList<>();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public int countProducts() {
        return this.products.size();
    }

    public void add(Product product) {
        this.products.add(product);
        System.out.println("Product has been added: " + product.toString());
    }

    public void remove(String name) {
        products.removeIf(product -> product.getName().equals(name));
    }
}
