import java.util.*;

public class BookShelf {
    private Map<String, LinkedList<String>> genreCatalog = new HashMap<>();
    private Set<String> allBooks = new HashSet<>(); // Optional: to avoid duplication

    public void addBook(String genre, String bookName) {
        if (allBooks.contains(bookName)) {
            System.out.println("Book already exists.");
            return;
        }

        genreCatalog.putIfAbsent(genre, new LinkedList<>());
        genreCatalog.get(genre).add(bookName);
        allBooks.add(bookName);
    }

    public void removeBook(String genre, String bookName) {
        if (genreCatalog.containsKey(genre)) {
            genreCatalog.get(genre).remove(bookName);
            allBooks.remove(bookName);
        }
    }

    public void printCatalog() {
        for (String genre : genreCatalog.keySet()) {
            System.out.println(genre + ": " + genreCatalog.get(genre));
        }
    }

    public static void main(String[] args) {
        BookShelf shelf = new BookShelf();
        shelf.addBook("Fiction", "The Alchemist");
        shelf.addBook("Fiction", "1984");
        shelf.addBook("Science", "A Brief History of Time");
        shelf.removeBook("Fiction", "1984");
        shelf.printCatalog();
    }
}
