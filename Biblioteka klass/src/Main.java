import java.util.*;

public class Main {
    public static void main(String[] args) {
        HomeLibrary library = new HomeLibrary();
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", 1951);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        library.addBook(book1);
        library.addBook(book2);

        List<Book> booksByAuthor = library.findBooksByAuthor("Harper Lee");
        for (Book book : booksByAuthor) {
            System.out.println("Book found: " + book.getTitle() + " by " + book.getAuthor());
        }

        library.sortBooksByTitle();
        for (Book book : library.books) {
            System.out.println("Book title: " + book.getTitle());
        }
    }
}