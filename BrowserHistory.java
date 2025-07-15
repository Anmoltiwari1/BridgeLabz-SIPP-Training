// BrowserHistory.java
class Node {
    String url;
    Node prev, next;

    Node(String url) {
        this.url = url;
    }
}

public class BrowserHistory {
    private Node current;

    // Constructor - set homepage
    public BrowserHistory(String homepage) {
        current = new Node(homepage);
    }

    // Navigate to a new page
    public void visit(String url) {
        Node newNode = new Node(url);
        current.next = newNode;
        newNode.prev = current;
        current = newNode;
    }

    // Move back by steps
    public void back(int steps) {
        while (steps > 0 && current.prev != null) {
            current = current.prev;
            steps--;
        }
    }

    // Move forward by steps
    public void forward(int steps) {
        while (steps > 0 && current.next != null) {
            current = current.next;
            steps--;
        }
    }

    // Get current page
    public String getCurrentPage() {
        return current.url;
    }

    public static void main(String[] args) {
        BrowserHistory history = new BrowserHistory("home.com");
        history.visit("about.com");
        history.visit("contact.com");
        history.back(1);
        System.out.println("Current Page: " + history.getCurrentPage()); // about.com
        history.forward(1);
        System.out.println("Current Page: " + history.getCurrentPage()); // contact.com
    }
}
