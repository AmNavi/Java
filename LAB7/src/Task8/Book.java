package Task8;

public class Book implements Printable {
    private String name;
    private String author;
    private int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    @Override
    public void print() {
        System.out.printf("Книга '%s' (автор %s) была издана в %d году \n", name, author, year);
    }

    // выводит названия только книг
    public static void printBooks(Printable[] printable) {
        for (Printable p : printable) {
            if (p instanceof Book) {
                Book b = (Book) p;
                System.out.println(b.name);
            }
        }
    }
}
