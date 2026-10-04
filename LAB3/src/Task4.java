import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int n;

        // Проверяем правильность размера
        do {
            System.out.print("Введите размер массива больше 0: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int[] numbers = new int[n];

        // Заполняем массив числами от 0 до n
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(n + 1);
        }

        System.out.println("Первый массив:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        // Сначала считаем количество четных
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                count++;
            }
        }

        int[] evenNumbers = new int[count];

        int index = 0;

        // Заполняем второй массив
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                evenNumbers[index] = numbers[i];
                index++;
            }
        }

        System.out.println("Второй массив:");

        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
    }
}
