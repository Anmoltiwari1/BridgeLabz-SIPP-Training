public abstract class Product implements Taxable {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public abstract double calculateDiscount();

    public double getFinalPrice() {
        return price + calculateTax() - calculateDiscount();
    }

    public void displayProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println(getTaxDetails());
        System.out.println("Discount: " + calculateDiscount());
        System.out.println("Final Price: " + getFinalPrice());
    }
}
