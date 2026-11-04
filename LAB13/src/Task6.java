import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите имя файла: ");
        String fileName = console.readLine();

        // читаем весь файл в одну строку
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        StringBuilder text = new StringBuilder();
        String line;
        while ((line = fileReader.readLine()) != null) {
            text.append(line).append(" ");
        }
        fileReader.close();

        if (text.toString().trim().isEmpty()) {
            System.out.println("Файл пустой");
            return;
        }

        String[] words = text.toString().trim().split("\\s+");
        StringBuilder result = getLine(words);
        System.out.println(result);
    }

    public static StringBuilder getLine(String... words) {
        StringBuilder result = new StringBuilder();
        if (words == null || words.length == 0) {
            return result;
        }
        boolean[] used = new boolean[words.length]; // какие слова уже взяли
        int[] order = new int[words.length];        // порядок слов

        if (build(words, used, order, 0)) {
            for (int i = 0; i < order.length; i++) {
                result.append(words[order[i]]);
                if (i < order.length - 1) {
                    result.append(" ");
                }
            }
        }
        return result;
    }

    // подбираем слово на позицию count (перебор с возвратом)
    private static boolean build(String[] words, boolean[] used, int[] order, int count) {
        if (count == words.length) {
            return true; // все слова расставили
        }
        for (int i = 0; i < words.length; i++) {
            if (used[i]) {
                continue;
            }
            boolean fits = true;
            if (count > 0) {
                String prev = words[order[count - 1]];
                char last = Character.toLowerCase(prev.charAt(prev.length() - 1));
                char first = Character.toLowerCase(words[i].charAt(0));
                fits = (last == first);
            }
            if (fits) {
                used[i] = true;
                order[count] = i;
                if (build(words, used, order, count + 1)) {
                    return true;
                }
                used[i] = false; // не получилось, отменяем
            }
        }
        return false;
    }
}