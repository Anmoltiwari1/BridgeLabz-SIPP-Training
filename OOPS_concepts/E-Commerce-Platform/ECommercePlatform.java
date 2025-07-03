import java.util.*;

public class ECommercePlatform {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Electronics("P1001", "Laptop", 75000));
        products.add(new Clothing("P1002", "T-Shirt", 1500));
        products.add(new Groceries("P1003", "Rice Bag", 1200));

        for (Product p : products) {
            p.displayProductDetails();
            System.out.println("---------------------------");
        }
    }
}
