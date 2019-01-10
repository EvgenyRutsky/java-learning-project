import java.util.ArrayList;

public class Search {

    public void searchByAuthor (Library library, String condition){

        ArrayList <Book> searchResult = new ArrayList<Book>();

        for (Book isRequestedBook: library.getBooksList()){

            if (isRequestedBook.getAuthor().equals(condition)){

                searchResult.add(isRequestedBook);

            }

        }

        isEmptyCheck(searchResult);

    }

    public void searchByTitle (Library library, String condition){

        ArrayList <Book> searchResult = new ArrayList<Book>();

        for (Book isRequestedBook: library.getBooksList()){

            if (isRequestedBook.getBookTitle().equals(condition)){

                searchResult.add(isRequestedBook);

            }

        }

        isEmptyCheck(searchResult);

    }

    public void searchByGenre (Library library, String condition){

        ArrayList <Book> searchResult = new ArrayList<Book>();

        for (Book isRequestedBook: library.getBooksList()){

            if (isRequestedBook.getGenre().equals(condition)){

                searchResult.add(isRequestedBook);

            }

        }

        isEmptyCheck(searchResult);

    }

    private void isEmptyCheck(ArrayList<Book> searchResult){

        if (searchResult.isEmpty()){

            System.out.println("По вашему запросу результатов не найдено\n");

        } else {

            getSearchResult(searchResult);
        }

    }

    private void getSearchResult(ArrayList<Book> searchResult){

        for (int i = 0; i < searchResult.size(); i++){

            Book bookToShow;
            bookToShow = searchResult.get(i);
            System.out.println(i + 1 + " " + bookToShow.getAuthor() + " " + bookToShow.getBookTitle());

        }

    }
}
