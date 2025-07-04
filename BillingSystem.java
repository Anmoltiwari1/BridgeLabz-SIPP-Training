// Abstract base class
abstract class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();

    public double getFinalPrice() {
        return price - calculateDiscount();
    }

    public void displayBill() {
        System.out.println("Product: " + name);
        System.out.println("Original Price: ₹" + price);
        System.out.println("Discount: ₹" + calculateDiscount());
        System.out.println("Final Price: ₹" + getFinalPrice());
        System.out.println("----------------------------");
    }
}

// Electronics subclass
class Electronics extends Product {
    public Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.10; // 10% discount
    }
}

// Clothing subclass
class Clothing extends Product {
    public Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.20; // 20% discount
    }
}

// Grocery subclass
class Grocery extends Product {
    public Grocery(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateDiscount() {
        return 0.0; // No discount
    }
}

// Main class
public class BillingSystem {
    public static void main(String[] args) {
        Product p1 = new Electronics("Smartphone", 30000);
        Product p2 = new Clothing("T-Shirt", 1500);
        Product p3 = new Grocery("Rice Bag", 800);

        p1.displayBill();
        p2.displayBill();
        p3.displayBill();
    }
}
