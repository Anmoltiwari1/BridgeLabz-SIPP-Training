import java.util.ArrayList;

class Product {
    String name;

    Product(String name) {
        this.name = name;
    }
}

class Order {
    int orderId;
    ArrayList<Product> products = new ArrayList<>();

    Order(int orderId) {
        this.orderId = orderId;
    }

    void addProduct(Product p) {
        products.add(p);
    }

    void showOrder() {
        System.out.println("Order ID: " + orderId);
        for (Product p : products) {
            System.out.println("Product: " + p.name);
        }
    }
}

class Customer {
    String name;
    ArrayList<Order> orders = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void placeOrder(Order o) {
        orders.add(o);
        System.out.println(name + " placed an order with ID: " + o.orderId);
    }
}

public class EcommercePlatform {
    public static void main(String[] args) {
        Customer customer = new Customer("Anmol");

        Product p1 = new Product("Laptop");
        Product p2 = new Product("Phone");

        Order order = new Order(101);
        order.addProduct(p1);
        order.addProduct(p2);

        customer.placeOrder(order);
        order.showOrder();
    }
}
