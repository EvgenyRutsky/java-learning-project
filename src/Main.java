public class Main {

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в вашу библиотеку\n");

        Book bk1 = new Book("Book Title 1", "Author 1", "Comedy");
        Book bk2 = new Book("Book Title 2", "Author 2", "Comedy");
        Book bk3 = new Book("Book Title 3", "Author 3", "Comedy");

        Library lb = new Library();

        lb.addBook(bk1);
        lb.addBook(bk2);
        lb.addBook(bk3);

        Librarian coolMan = new Librarian();

        coolMan.Interaction(lb);


    }


}
