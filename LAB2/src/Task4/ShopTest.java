package Task4;

import java.util.Scanner;

public class ShopTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Shop shop = new Shop(5);

        // Вводим компьютеры
        for (int i = 0; i < 3; i++) {

            System.out.print("Введите название компьютера: ");
            String name = scanner.nextLine();

            shop.addComputer(new Computer(name));
        }

        System.out.println("Компьютеры в магазине:");
        shop.printComputers();

        System.out.print("Какой компьютер найти? ");
        String name = scanner.nextLine();

        Computer computer = shop.findComputer(name);

        if (computer != null) {
            System.out.println("Компьютер найден: " + computer);
        } else {
            System.out.println("Компьютер не найден");
        }

        System.out.print("Какой номер удалить? ");
        int number = scanner.nextInt();

        shop.removeComputer(number);

        System.out.println("После удаления:");
        shop.printComputers();
    }
}
