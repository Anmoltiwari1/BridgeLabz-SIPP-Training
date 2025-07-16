import java.util.*;

class Customer {
    String name;
    List<String> items;

    Customer(String name, List<String> items) {
        this.name = name;
        this.items = items;
    }
}

public class SmartCheckout {
    private Queue<Customer> checkoutQueue = new LinkedList<>();
    private Map<String, Integer> itemPrice = new HashMap<>();
    private Map<String, Integer> stock = new HashMap<>();

    public void addItem(String item, int price, int quantity) {
        itemPrice.put(item, price);
        stock.put(item, quantity);
    }

    public void addCustomer(String name, List<String> items) {
        checkoutQueue.add(new Customer(name, items));
    }

    public void processNextCustomer() {
        if (checkoutQueue.isEmpty()) {
            System.out.println("No customers in queue.");
            return;
        }

        Customer current = checkoutQueue.poll();
        int total = 0;

        System.out.println("Processing " + current.name);
        for (String item : current.items) {
            if (stock.getOrDefault(item, 0) > 0) {
                total += itemPrice.get(item);
                stock.put(item, stock.get(item) - 1);
            } else {
                System.out.println(item + " is out of stock.");
            }
        }

        System.out.println("Total Bill: ₹" + total);
    }

    public static void main(String[] args) {
        SmartCheckout sc = new SmartCheckout();
        sc.addItem("Milk", 50, 10);
        sc.addItem("Bread", 30, 5);

        sc.addCustomer("Anmol", Arrays.asList("Milk", "Bread"));
        sc.addCustomer("Tiwari", Arrays.asList("Bread", "Bread", "Milk"));

        sc.processNextCustomer();
        sc.processNextCustomer();
    }
}
