import java.util.ArrayList;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Book: " + title + ", Author: " + author);
    }
}

class Library {
    String name;
    ArrayList<Book> books = new ArrayList<>();

    Library(String name) {
        this.name = name;
    }

    void addBook(Book book) {
        books.add(book);
    }

    void showBooks() {
        System.out.println("Library: " + name);
        for (Book b : books) {
            b.display();
        }
    }
}

public class LibraryAggregation {
    public static void main(String[] args) {
        Book book1 = new Book("Java Basics", "James");
        Book book2 = new Book("C++ Fundamentals", "Bjarne");

        Library lib1 = new Library("City Library");
        Library lib2 = new Library("University Library");

        lib1.addBook(book1);
        lib2.addBook(book1);
        lib2.addBook(book2);

        lib1.showBooks();
        lib2.showBooks();
    }
}
