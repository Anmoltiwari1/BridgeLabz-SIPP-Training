public class book{
    String title;
    String author;
    int price;

    public book(){
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0;
    }

    public book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
}