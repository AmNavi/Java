package Task1;

import java.util.Scanner;

public class OnlineOrderApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите ФИО: ");
        String name = sc.nextLine();

        System.out.print("Введите ИНН: ");
        String inn = sc.nextLine();

        try {
            InnValidator.checkInn(inn);
            System.out.println("Заказ оформлен для " + name);
        } catch (InvalidInnException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}