package Task10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слова через пробел:");

        String text = scanner.nextLine();

        // Убираем лишние пробелы
        text = text.trim();

        if (text.isEmpty()) {
            System.out.println("Количество слов: 0");
        } else {

            String[] words = text.split("\\s+");

            System.out.println("Количество слов: " + words.length);
        }
    }
}
