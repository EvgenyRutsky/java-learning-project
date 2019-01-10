import java.util.Scanner;

public class Librarian {

    private Scanner scanner;

    public void Interaction (Library library){

        System.out.println( "Выберите доступное действие:\n" +
                            "1. Просмотреть список книг\n" +
                            "2. Добвить новую книгу\n" +
                            "3. Удалить книгу\n" +
                            "4. Поиск книги");



        scanner = new Scanner(System.in);
        int userAnswer = scanner.nextInt();

        if (userAnswer == 1){

            showBooksAction(library);

        }else if (userAnswer == 2){

            addBookAction(library);

        }else if (userAnswer == 3){

            removeBookAction(library);

        }else if (userAnswer == 4) {

            searchHandler(library);

        }else{

            System.out.println("Данная опция не доступна, введите другую опцию");

        }

    }

    private void showBooksAction (Library library){

        for (int i = 0; i < library.getBooksList().size(); i++){

            Book bookToShow;
            bookToShow = library.getBooksList().get(i);
            System.out.println(i + 1 + " " + bookToShow.getAuthor() + " " + bookToShow.getBookTitle());

        }

        Interaction(library);

    }

    private void addBookAction (Library library) {

        String bookTitle;
        String genre;
        String author;

        System.out.println("Введите автора");
        scanner = new Scanner(System.in);
        author = scanner.nextLine();

        if (!author.equals("") ) {

            System.out.println("Введите название книги");
            bookTitle = scanner.nextLine();

            if (!bookTitle.equals("") ) {

                System.out.println("Введите жанр");
                genre = scanner.nextLine();

                if (!genre.equals("")){

                    Book bookToAdd = new Book(bookTitle, author, genre);
                    library.addBook(bookToAdd);
                    System.out.println("Книга добавлена");
                    Interaction(library);


                } else {

                    System.out.println("Жанр есть у любой книги!");
                    addBookAction(library);

                }

            } else {

                System.out.println("Название есть у любой книги!");
                addBookAction(library);

            }


        } else {

            System.out.println("Автор есть у любой книги!");
            addBookAction(library);

        }

    }

    private void removeBookAction (Library library){

        Book bookToRemove;
        System.out.println("Выберите книгу для удаления");

        for (int i = 0; i < library.getBooksList().size(); i++){

            bookToRemove = library.getBooksList().get(i);
            System.out.println(i + 1 + " " + bookToRemove.getAuthor() + " " + bookToRemove.getBookTitle());

        }
        scanner = new Scanner(System.in);
        int selectedBook = scanner.nextInt();

        library.removeBook(library.getBooksList().get(selectedBook - 1));
        System.out.println("Выбранная книга для удалена");
        Interaction(library);



    }

    private void searchHandler (Library library){

        System.out.println("Выберите критерий для поиска\n" +
                "1. Поиск по автору\n" +
                "2. Поиск по названию книги\n" +
                "3. Поиск по жанру");

        scanner = new Scanner(System.in);
        int conditionType = scanner.nextInt();
        String condition;
        Search sr = new Search();

        if (conditionType == 1){

            System.out.println("Введите Автора");

            scanner = new Scanner(System.in);
            condition = scanner.nextLine();
            sr.searchByAuthor(library, condition);

        } else if (conditionType == 2){

            System.out.println("Введите название книги");

            scanner = new Scanner(System.in);
            condition = scanner.nextLine();
            sr.searchByTitle(library, condition);

        }else if (conditionType == 3){

            System.out.println("Введите название жанр");

            scanner = new Scanner(System.in);
            condition = scanner.nextLine();
            sr.searchByGenre(library, condition);

        } else {

            System.out.println("Поиск по заданному параметру невозможен");
            searchHandler(library);

        }

        Interaction(library);

    }


}
