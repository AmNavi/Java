package Task8;

public class Task8 {
    public static void main(String[] args) {

        String[] words = {"one", "two", "three", "four", "five"};

        // Меняем элементы местами
        for (int i = 0; i < words.length / 2; i++) {

            String temp = words[i];

            words[i] = words[words.length - 1 - i];

            words[words.length - 1 - i] = temp;
        }

        // Выводим результат
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
    }
}
