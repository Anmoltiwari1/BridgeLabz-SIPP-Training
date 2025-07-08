package LinkedList;
class BookNode {
    String title, author, genre;
    int bookId;
    boolean isAvailable;
    BookNode next, prev;

    public BookNode(String title, String author, String genre, int bookId, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
}

public class LibraryManagementSystem {
    private BookNode head = null;
    private BookNode tail = null;

    // Add at beginning
    public void addAtBeginning(String title, String author, String genre, int id, boolean available) {
        BookNode newNode = new BookNode(title, author, genre, id, available);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Add at end
    public void addAtEnd(String title, String author, String genre, int id, boolean available) {
        BookNode newNode = new BookNode(title, author, genre, id, available);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Add at specific position (1-based index)
    public void addAtPosition(String title, String author, String genre, int id, boolean available, int position) {
        if (position <= 1) {
            addAtBeginning(title, author, genre, id, available);
            return;
        }

        BookNode newNode = new BookNode(title, author, genre, id, available);
        BookNode temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null || temp.next == null) {
            addAtEnd(title, author, genre, id, available);
        } else {
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        }
    }

    // Remove by Book ID
    public void removeById(int bookId) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                if (temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } else if (temp == tail) {
                    tail = tail.prev;
                    if (tail != null) tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                System.out.println("Book ID " + bookId + " removed.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book ID " + bookId + " not found.");
    }

    // Search by Title or Author
    public void search(String keyword) {
        boolean found = false;
        BookNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(keyword) || temp.author.equalsIgnoreCase(keyword)) {
                System.out.println("Found: " + temp.title + " by " + temp.author + " [" + (temp.isAvailable ? "Available" : "Unavailable") + "]");
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No matching book found.");
    }

    // Update availability status
    public void updateAvailability(int bookId, boolean status) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.isAvailable = status;
                System.out.println("Availability updated for Book ID " + bookId);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book ID not found.");
    }

    // Display books forward
    public void displayForward() {
        BookNode temp = head;
        System.out.println("Books (Forward):");
        while (temp != null) {
            System.out.println("ID: " + temp.bookId + " | " + temp.title + " | " + temp.author + " | " + temp.genre + " | " + (temp.isAvailable ? "Available" : "Unavailable"));
            temp = temp.next;
        }
    }

    // Display books reverse
    public void displayReverse() {
        BookNode temp = tail;
        System.out.println("Books (Reverse):");
        while (temp != null) {
            System.out.println("ID: " + temp.bookId + " | " + temp.title + " | " + temp.author + " | " + temp.genre + " | " + (temp.isAvailable ? "Available" : "Unavailable"));
            temp = temp.prev;
        }
    }

    // Count total books
    public int countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Main demo
    public static void main(String[] args) {
        LibraryManagementSystem lib = new LibraryManagementSystem();

        lib.addAtEnd("Harry Potter", "J.K. Rowling", "Fantasy", 1, true);
        lib.addAtBeginning("Sherlock Holmes", "Arthur Conan Doyle", "Mystery", 2, false);
        lib.addAtPosition("The Hobbit", "J.R.R. Tolkien", "Fantasy", 3, true, 2);

        lib.displayForward();
        System.out.println("\nTotal books: " + lib.countBooks());

        lib.search("J.K. Rowling");
        lib.updateAvailability(2, true);
        lib.removeById(1);

        lib.displayReverse();
    }
}
