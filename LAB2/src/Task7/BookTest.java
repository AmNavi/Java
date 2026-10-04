package Task7;

public class BookTest {
    public static void main(String[] args) {

        BookShelf shelf = new BookShelf(5);

        shelf.addBook(new Book("Толстой", "Война и мир", 1869));
        shelf.addBook(new Book("Пушкин", "Евгений Онегин", 1833));
        shelf.addBook(new Book("Булгаков", "Мастер и Маргарита", 1967));

        System.out.println("Все книги:");
        shelf.printBooks();

        System.out.println();
        System.out.println("Самая ранняя:");
        System.out.println(shelf.getFirstBook());

        System.out.println();
        System.out.println("Самая поздняя:");
        System.out.println(shelf.getLastBook());

        // Сортируем книги
        shelf.sortBooks();

        System.out.println();
        System.out.println("После сортировки:");
        shelf.printBooks();
    }
}
