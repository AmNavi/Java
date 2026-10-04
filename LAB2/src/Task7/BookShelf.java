package Task7;

public class BookShelf {

    private Book[] books;
    private int count;

    public BookShelf(int size) {
        books = new Book[size];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
        }
    }

    // Находим самую раннюю книгу
    public Book getFirstBook() {

        Book result = books[0];

        for (int i = 1; i < count; i++) {

            if (books[i].getYear() < result.getYear()) {
                result = books[i];
            }
        }

        return result;
    }

    // Находим самую позднюю книгу
    public Book getLastBook() {

        Book result = books[0];

        for (int i = 1; i < count; i++) {

            if (books[i].getYear() > result.getYear()) {
                result = books[i];
            }
        }

        return result;
    }

    // Сортируем книги по году
    public void sortBooks() {

        for (int i = 0; i < count - 1; i++) {

            for (int j = 0; j < count - 1 - i; j++) {

                if (books[j].getYear() > books[j + 1].getYear()) {

                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }

    public void printBooks() {

        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }
}
