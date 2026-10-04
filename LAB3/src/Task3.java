import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[4];

        // Заполняем массив числами от 10 до 99
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(90) + 10;
        }

        System.out.println("Массив:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        boolean increasing = true;

        // Проверяем строгое возрастание
        for (int i = 0; i < numbers.length - 1; i++) {

            if (numbers[i] >= numbers[i + 1]) {
                increasing = false;
            }
        }

        if (increasing) {
            System.out.println("Массив является строго возрастающим");
        } else {
            System.out.println("Массив не является строго возрастающим");
        }
    }
}
