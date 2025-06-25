public class Product {
    String productName; // Instance variable
    double price;       // Instance variable
    static int totalProducts = 0; // Class variable

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: ₹" + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total products created: " + totalProducts);
    }
}
