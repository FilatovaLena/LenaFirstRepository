package BooksStorePOO;

public abstract class Book {


    String bookName;
    String authorName;
    int id;
    double usdPrice;
    boolean isAvailable;
    String Euro = "EUR";
    String RUB = "RUB";

    public Book (String name, String authorName, int id, double price, boolean isAvailable){
        this.bookName = name;
        this.authorName = authorName;
        this.id = id;
        this.usdPrice = price;
        this.isAvailable = isAvailable;


    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getUsdPrice() {
        return usdPrice;
    }

    public void setUsdPrice(double usdPrice) {
        this.usdPrice = usdPrice;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public double convertPrice( String currency) {
        double rate = 1;
        if (currency.equals((Euro))){
            rate = 1.1;
        }
        else if (currency.equals(RUB)) {
            rate = 70;
        }
        else {
            System.out.println("Error: unknown currency, USD price will be returned ");
        }
        double priceAfterConversion = usdPrice * rate;
        return priceAfterConversion;

    }
public void printBookDetails(){
    System.out.println("Book name is " + bookName );
    System.out.println("Book ID is " + id );
    System.out.println("Book price " + usdPrice + " USD, "  + convertPrice( Euro ) + "Euro" + convertPrice(RUB) + "RUB" );
    System.out.println("Book is available " + isAvailable );

}

}
