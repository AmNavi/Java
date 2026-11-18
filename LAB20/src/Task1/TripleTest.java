package Task1;

public class TripleTest {
    public static void main(String[] args) {
        Triple<String, Cat, Integer> triple =
                new Triple<>("Привет", new Cat("Мурка"), 25);

        System.out.println(triple.getFirst());
        System.out.println(triple.getSecond().getName());
        System.out.println(triple.getThird());

        System.out.println("Имена классов:");
        triple.printClasses();
    }
}
