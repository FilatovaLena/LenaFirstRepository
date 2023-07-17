package lesson1;

public class Book {
    //   describe a book, create all variables we need
    // name, author, ID, price in USD, availability
    // using conversion rate, calculate EUR price of the book
    // using conversion rate, calculate RUB price of the book
    // print all the book details including prices

    String Euro = "EUR";
    String RUB = "RUB";

    public static void main(String[] args) {
        String bookName = "Harry Potter";
        String bookAuthor = "J.K. Rowling";
        int id = 1;
        double priceInUSD = 10.5;
        boolean isAvailable = true;

        Book book1 = new Book();
        book1.creteNewBook("Harry Potter", "J.K. Rowling", 1, 10.5, false);
        book1.creteNewBook("Anna Karenina", "l. Tolstoy", 2, 20, true);

        double rate = 1.1;
        double priceInEUR = priceInUSD * rate;

        System.out.println("Book name is " + bookName );
        System.out.println("Book ID is " + id );
        System.out.println("Book price " + priceInUSD + " USD, "  + priceInEUR + " EUR" );
        System.out.println("Book is available " + isAvailable );


    }

    public void creteNewBook(String bookName, String authorName, int id, double priceInUSD, boolean isAvailable) {

        double priceInEUR = calculatePrice(priceInUSD, Euro);
        double priceInRUB = calculatePrice(priceInUSD, RUB);


        System.out.println("Book name is " + bookName);
        System.out.println("Book ID is " + id);
        System.out.println("Book price " + priceInUSD + " USD, " + priceInEUR + " EUR " + priceInRUB + " RUB ");
        System.out.println("Book is available " + isAvailable);
    }

    public double calculatePrice(double priceInUSD, String currency) {
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
        double priceAfterConversion = priceInUSD * rate;
        return priceAfterConversion;

    }
}
