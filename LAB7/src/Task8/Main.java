package Task8;

public class Main {
    public static void main(String[] args) {
        Printable[] items = new Printable[4];
        items[0] = new Book("Война и мир", "Л. Н. Толстой", 1863);
        items[1] = new Magazine("Хакер");
        items[2] = new Book("Отцы и дети", "И. Тургенев", 1862);
        items[3] = new Magazine("Компьютерра");

        System.out.println("Книги:");
        Book.printBooks(items);

        System.out.println("Журналы:");
        Magazine.printMagazines(items);
    }
}
