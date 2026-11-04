import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task5 {
    static final int N = 50000;

    public static void test(List<Integer> list, String name) {
        System.out.println(name);

        // добавление в конец
        long start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            list.add(i);
        }
        System.out.println("Добавление " + N + " элементов: " + (System.nanoTime() - start) / 1000 + " мкс");

        // вставка в начало
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            list.add(0, i);
        }
        System.out.println("Вставка в начало 1000 раз: " + (System.nanoTime() - start) / 1000 + " мкс");

        // поиск элемента, которого нет (самый долгий случай)
        start = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            list.contains(-1);
        }
        System.out.println("Поиск 100 раз: " + (System.nanoTime() - start) / 1000 + " мкс");

        // удаление из середины
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            list.remove(list.size() / 2);
        }
        System.out.println("Удаление из середины 1000 раз: " + (System.nanoTime() - start) / 1000 + " мкс");
        System.out.println();
    }

    public static void main(String[] args) {
        test(new ArrayList<Integer>(), "ArrayList");
        test(new LinkedList<Integer>(), "LinkedList");
    }
}