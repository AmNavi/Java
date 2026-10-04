

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        // Заполняем массив с помощью do while
        int i = 0;

        do {
            System.out.print("Введите число: ");
            numbers[i] = scanner.nextInt();
            i++;
        } while (i < numbers.length);

        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];

        // Считаем сумму, максимум и минимум с помощью while
        i = 0;

        while (i < numbers.length) {

            sum = sum + numbers[i];

            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }

            i++;
        }

        System.out.println("Сумма = " + sum);
        System.out.println("Максимальный элемент = " + max);
        System.out.println("Минимальный элемент = " + min);
    }
}
