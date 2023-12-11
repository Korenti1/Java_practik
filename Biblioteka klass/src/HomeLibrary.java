import java.util.*;

class HomeLibrary {
    public List<Book> books;

    public HomeLibrary() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> findBooksByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> findBooksByYear(int year) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() == year) {
                result.add(book);
            }
        }
        return result;
    }

    public void sortBooksByTitle() {
        books.sort(Comparator.comparing(Book::getTitle));
    }

    public void sortBooksByAuthor() {
        books.sort(Comparator.comparing(Book::getAuthor));
    }

    public void sortBooksByYear() {
        books.sort(Comparator.comparingInt(Book::getYear));
    }
}
