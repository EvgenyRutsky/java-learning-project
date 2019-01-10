import java.util.ArrayList;

public class Library {

    private ArrayList<Book> booksList = new ArrayList<Book>();

    public void addBook(Book book) {

        booksList.add(book);

    }

    public void removeBook(Book book) {

        booksList.remove(book);
    }

    public ArrayList<Book> getBooksList () {

        return booksList;

    }

}
