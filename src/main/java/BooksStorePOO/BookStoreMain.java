package BooksStorePOO;

public class BookStoreMain {

    public static void main(String[] args) {

    AudioBook book1 = new AudioBook("Harry Potter", "J.K. Rowling", 1, 10.5, false, "mp3", 128, "Smith");
    book1.printBookDetails();
    EBook book2 = new EBook("Anna Karenina", "l. Tolstoy", 2, 20, true, "www.book");
    book2.printBookDetails();


//    Book book2 = new Book("Anna Karenina", "l. Tolstoy", 2, 20, true);
//
//    book1.setAvailable(true);
//    book2.setUsdPrice(30);
//
//    book1.printBookDetails();
//    book2.printBookDetails();

    }

}