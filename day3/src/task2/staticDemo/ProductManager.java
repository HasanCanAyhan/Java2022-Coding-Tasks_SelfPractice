package task2.staticDemo;

public class ProductManager {
    public void add(Product product) {
        if (ProductValidator.isValid(product)) {
            System.out.println("Added");
        } else {
            System.out.println("Product Infos are not valid");
        }

    }
}