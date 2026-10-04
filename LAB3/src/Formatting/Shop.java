package Formatting;

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите валюту:");
        System.out.println("1 - Рубли");
        System.out.println("2 - Доллары");
        System.out.println("3 - Евро");

        int choice = scanner.nextInt();

        System.out.print("Введите стоимость товара: ");
        double price = scanner.nextDouble();

        if (choice == 1) {
            System.out.printf("Стоимость товара: %.2f руб.%n", price);
        } else if (choice == 2) {
            System.out.printf("Стоимость товара: %.2f $%n", price);
        } else if (choice == 3) {
            System.out.printf("Стоимость товара: %.2f €%n", price);
        } else {
            System.out.println("Неверный выбор");
        }
    }
}
