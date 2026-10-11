package Task8;

public class Magazine implements Printable {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.printf("Журнал '%s'\n", name);
    }

    // выводит названия только журналов
    public static void printMagazines(Printable[] printable) {
        for (Printable p : printable) {
            if (p instanceof Magazine) {
                Magazine m = (Magazine) p;
                System.out.println(m.name);
            }
        }
    }
}
