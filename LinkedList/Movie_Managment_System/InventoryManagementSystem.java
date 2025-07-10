package LinkedList;

class ItemNode {
    String name;
    int id, quantity;
    double price;
    ItemNode next;

    ItemNode(String name, int id, int quantity, double price) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }
}

public class InventoryManagementSystem {
    ItemNode head = null;

    void addItemEnd(String name, int id, int qty, double price) {
        ItemNode newNode = new ItemNode(name, id, qty, price);
        if (head == null) head = newNode;
        else {
            ItemNode temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }

    void updateQuantity(int id, int qty) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.quantity = qty;
                System.out.println("Quantity updated.");
                return;
            }
            temp = temp.next;
        }
    }

    void totalInventoryValue() {
        ItemNode temp = head;
        double total = 0;
        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: " + total);
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        ims.addItemEnd("Mouse", 101, 50, 250.0);
        ims.addItemEnd("Keyboard", 102, 30, 500.0);
        ims.totalInventoryValue();
        ims.updateQuantity(101, 60);
    }
}
