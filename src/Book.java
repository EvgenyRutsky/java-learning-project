public class Book {

    private String bookTitle;
    private String author;
    private String genre;


    public Book (String bookTitle, String author, String genre){

        this.bookTitle = bookTitle;
        this.author = author;
        this.genre = genre;

    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }
}
