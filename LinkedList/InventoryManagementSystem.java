package LinkedList;
class ItemNode {
    String itemName;
    int itemId, quantity;
    double price;
    ItemNode next;

    public ItemNode(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

public class InventoryManagementSystem {
    private ItemNode head;

    // Add at beginning
    public void addAtBeginning(String name, int id, int qty, double price) {
        ItemNode newNode = new ItemNode(name, id, qty, price);
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    public void addAtEnd(String name, int id, int qty, double price) {
        ItemNode newNode = new ItemNode(name, id, qty, price);
        if (head == null) {
            head = newNode;
            return;
        }
        ItemNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    // Add at specific position (1-based)
    public void addAtPosition(String name, int id, int qty, double price, int pos) {
        if (pos <= 1) {
            addAtBeginning(name, id, qty, price);
            return;
        }
        ItemNode newNode = new ItemNode(name, id, qty, price);
        ItemNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;
        if (temp == null) {
            addAtEnd(name, id, qty, price);
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove by Item ID
    public void removeById(int id) {
        if (head == null) return;
        if (head.itemId == id) {
            head = head.next;
            return;
        }
        ItemNode temp = head;
        while (temp.next != null && temp.next.itemId != id)
            temp = temp.next;
        if (temp.next != null)
            temp.next = temp.next.next;
    }

    // Update quantity by Item ID
    public void updateQuantity(int id, int newQty) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                System.out.println("Quantity updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item ID not found.");
    }

    // Search by Item ID or Name
    public void searchItem(String key) {
        boolean found = false;
        ItemNode temp = head;
        while (temp != null) {
            if (String.valueOf(temp.itemId).equals(key) || temp.itemName.equalsIgnoreCase(key)) {
                System.out.println("Found: " + temp.itemName + " | ID: " + temp.itemId + " | Qty: " + temp.quantity + " | ₹" + temp.price);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("Item not found.");
    }

    // Display all items
    public void displayItems() {
        ItemNode temp = head;
        while (temp != null) {
            System.out.println("Item: " + temp.itemName + ", ID: " + temp.itemId + ", Qty: " + temp.quantity + ", Price: ₹" + temp.price);
            temp = temp.next;
        }
    }

    // Calculate total inventory value
    public void calculateTotalValue() {
        double total = 0;
        ItemNode temp = head;
        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: ₹" + total);
    }

    // Merge Sort - sort by name or price
    public void sort(String criteria, boolean ascending) {
        head = mergeSort(head, criteria, ascending);
        System.out.println("Inventory sorted by " + criteria + " (" + (ascending ? "asc" : "desc") + ").");
    }

    private ItemNode mergeSort(ItemNode head, String criteria, boolean asc) {
        if (head == null || head.next == null)
            return head;

        ItemNode middle = getMiddle(head);
        ItemNode nextOfMiddle = middle.next;
        middle.next = null;

        ItemNode left = mergeSort(head, criteria, asc);
        ItemNode right = mergeSort(nextOfMiddle, criteria, asc);

        return merge(left, right, criteria, asc);
    }

    private ItemNode getMiddle(ItemNode head) {
        if (head == null) return head;
        ItemNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ItemNode merge(ItemNode left, ItemNode right, String criteria, boolean asc) {
        if (left == null) return right;
        if (right == null) return left;

        boolean condition;
        if (criteria.equalsIgnoreCase("name"))
            condition = asc ? left.itemName.compareTo(right.itemName) < 0 : left.itemName.compareTo(right.itemName) > 0;
        else
            condition = asc ? left.price < right.price : left.price > right.price;

        ItemNode result;
        if (condition) {
            result = left;
            result.next = merge(left.next, right, criteria, asc);
        } else {
            result = right;
            result.next = merge(left, right.next, criteria, asc);
        }
        return result;
    }

    // Demo
    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        ims.addAtEnd("Mouse", 101, 50, 250.0);
        ims.addAtEnd("Keyboard", 102, 30, 450.0);
        ims.addAtBeginning("Monitor", 103, 20, 7000.0);
        ims.addAtPosition("Webcam", 104, 15, 1200.0, 2);

        System.out.println("Inventory:");
        ims.displayItems();

        System.out.println("\nSearch Item by ID:");
        ims.searchItem("102");

        System.out.println("\nUpdate Quantity:");
        ims.updateQuantity(101, 60);

        System.out.println("\nTotal Inventory Value:");
        ims.calculateTotalValue();

        System.out.println("\nSort by Price Descending:");
        ims.sort("price", false);
        ims.displayItems();
    }
}
