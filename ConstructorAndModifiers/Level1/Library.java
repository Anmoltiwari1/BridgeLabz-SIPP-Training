public class Book{
    String title;
    String author;
    int price;
    int availability;

    public Book() {  
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0;
        this.availability = 0; // Default availability
    }

    public Book(String title,String author,int price,int availability){
        this.title=title;
        this.author=author;
        this.price=price;   
        this.availability = availability; 
    }
}