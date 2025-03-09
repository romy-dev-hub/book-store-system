package BookGestion;

public class Book {

    private String title;
    private String author;
    private double price;
    private final String ISBN ;

    private static int BookCounter = 0;
    private static final String Library = "my Library";

    public Book (String title, String author, double price, String ISBN){
        this.title = title;
        this.author = author;
        this.price = price;
        this.ISBN = ISBN;
        BookCounter++;
    }

    public Book(String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.price = 0.0;
        this.ISBN = ISBN;
        BookCounter++;
    }

    public String getTitle(){                  //getter
        return title;
    }

    public double getPrice(){                  //getter
        return price;
    }

    public void setTitle(String title) {       //setter
        this.title = title;
    }

    public void setPrice(double price) {       //setter
        if (price > 0){
            this.price = price;
        }else {
            System.out.print("price can't be negative dummy!");
        }
    }

    public String getAuthor() {               //getter
        return author;
    }

    public void setAuthor(String author) {    //setter
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public static int getBookCounter() {      //getter
        return BookCounter;
    }

    public void Display(){
        System.out.print("\nthe book title: " +getTitle());
        System.out.print("\nits author: " +getAuthor());
        System.out.print("\nits price: " +getPrice());
        System.out.print("\nthe book ISBN: " +getISBN());
    }

    @Override
    public String toString(){
        return "book: [title = " + title + ", author: " + author + ", price: " + price + ", ISBN: " + ISBN + "]";
    }

    //note: toString() always returns a memory @ so we user override to oblige it to return actual infos
}
