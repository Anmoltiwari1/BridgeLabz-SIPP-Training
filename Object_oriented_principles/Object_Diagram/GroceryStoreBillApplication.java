import java.util.ArrayList;

class Product {
    String name;
    double quantity; // e.g., in kg or liters
    double pricePerUnit;

    Product(String name, double quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    double getTotalPrice() {
        return quantity * pricePerUnit;
    }
}

class Customer {
    String name;
    ArrayList<Product> products = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void addProduct(Product product) {
        products.add(product);
    }

    ArrayList<Product> getProducts() {
        return products;
    }
}

class BillGenerator {
    double generateBill(Customer customer) {
        double total = 0;
        System.out.println("Bill for " + customer.name + ":");
        for (Product product : customer.getProducts()) {
            double productTotal = product.getTotalPrice();
            System.out.println(product.name + " - Quantity: " + product.quantity + ", Rate: $" + product.pricePerUnit + ", Total: $" + productTotal);
            total += productTotal;
        }
        System.out.println("Total Bill: $" + total);
        return total;
    }
}

public class GroceryStoreBillApplication {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice");

        customer.addProduct(new Product("Apples", 2, 3));  // 2kg @ $3/kg
        customer.addProduct(new Product("Milk", 1, 2));     // 1L @ $2/L

        BillGenerator billGen = new BillGenerator();
        billGen.generateBill(customer);
    }
}
