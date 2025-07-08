class MovieNode {
    String title, director;
    int year;
    double rating;
    MovieNode next, prev;

    MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }
}

public class MovieManagementSystem {
    MovieNode head, tail;

    void addAtEnd(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (head == null) head = tail = newNode;
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void displayForward() {
        MovieNode temp = head;
        while (temp != null) {
            System.out.println(temp.title + " - " + temp.director);
            temp = temp.next;
        }
    }

    void displayReverse() {
        MovieNode temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " - " + temp.director);
            temp = temp.prev;
        }
    }

    void removeByTitle(String title) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                if (temp == head) head = temp.next;
                if (temp == tail) tail = temp.prev;
                if (temp.prev != null) temp.prev.next = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;
                break;
            }
            temp = temp.next;
        }
    }

    void searchByDirector(String director) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director))
                System.out.println("Found: " + temp.title);
            temp = temp.next;
        }
    }

    void updateRating(String title, double newRating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating Updated");
                return;
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        MovieManagementSystem ms = new MovieManagementSystem();
        ms.addAtEnd("Inception", "Nolan", 2010, 8.8);
        ms.addAtEnd("Interstellar", "Nolan", 2014, 8.6);
        ms.displayForward();
        ms.updateRating("Inception", 9.0);
        ms.displayReverse();
    }
}
