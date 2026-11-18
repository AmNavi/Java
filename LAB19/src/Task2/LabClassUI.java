package Task2;

import java.util.Scanner;

public class LabClassUI {
    private LabClass labClass;
    private Scanner sc;

    public LabClassUI(LabClass labClass) {
        this.labClass = labClass;
        sc = new Scanner(System.in);
    }

    public void start() {
        int choice = -1;

        while (choice != 0) {
            System.out.println("\n1 - показать студентов");
            System.out.println("2 - отсортировать по среднему баллу");
            System.out.println("3 - найти студента");
            System.out.println("0 - выход");
            System.out.print("Ваш выбор: ");

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                choice = -1;
            }

            switch (choice) {
                case 1:
                    labClass.printStudents();
                    break;
                case 2:
                    labClass.sortStudents();
                    System.out.println("Список отсортирован");
                    labClass.printStudents();
                    break;
                case 3:
                    findStudent();
                    break;
                case 0:
                    System.out.println("Выход");
                    break;
                default:
                    System.out.println("Неверный пункт меню");
            }
        }
    }

    private void findStudent() {
        System.out.print("Введите фамилию и имя: ");
        String name = sc.nextLine();

        try {
            System.out.println(labClass.findStudent(name));
        } catch (EmptyStringException | StudentNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
