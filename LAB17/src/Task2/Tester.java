package Task2;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentList list = new StudentList();
        int choice = -1;

        while (choice != 0) {
            System.out.println();
            System.out.println("1 - добавить студента");
            System.out.println("2 - удалить студента по номеру");
            System.out.println("3 - показать студента по номеру");
            System.out.println("4 - показать всех (от начала к концу)");
            System.out.println("5 - показать всех (от конца к началу)");
            System.out.println("6 - очистить список");
            System.out.println("7 - проверить, пуст ли список");
            System.out.println("0 - выход");
            System.out.print("Ваш выбор: ");
            choice = readInt(sc);

            switch (choice) {
                case 1:
                    Student s = new Student();
                    try {
                        s.read(sc);
                        list.add(s);
                    } catch (NumberFormatException e) {
                        System.out.println("Неверный ввод, студент не добавлен");
                    }
                    break;
                case 2:
                    System.out.print("Номер: ");
                    if (list.remove(readInt(sc))) {
                        System.out.println("Студент удалён");
                    } else {
                        System.out.println("Нет элемента с таким номером");
                    }
                    break;
                case 3:
                    System.out.print("Номер: ");
                    list.printElement(readInt(sc));
                    break;
                case 4:
                    list.printAll();
                    break;
                case 5:
                    list.printReverse();
                    break;
                case 6:
                    list.clear();
                    System.out.println("Список очищен");
                    break;
                case 7:
                    if (list.isEmpty()) {
                        System.out.println("Список пуст");
                    } else {
                        System.out.println("В списке студентов: " + list.getSize());
                    }
                    break;
                case 0:
                    System.out.println("Выход");
                    break;
                default:
                    System.out.println("Неверный пункт меню");
            }
        }
    }

    // читаем число, при ошибке возвращаем -1
    static int readInt(Scanner sc) {
        try {
            return Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
