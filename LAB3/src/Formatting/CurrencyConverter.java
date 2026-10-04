package Formatting;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму в рублях: ");
        double rubles = scanner.nextDouble();

        // Пример курса
        double dollar = rubles / 80;
        double euro = rubles / 90;

        System.out.printf("Доллары: %.2f%n", dollar);
        System.out.printf("Евро: %.2f%n", euro);
    }
}
