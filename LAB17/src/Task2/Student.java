package Task2;

import java.util.Scanner;

// узел двусвязного списка - элемент картотеки (студент)
public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double gpa;     // средний балл
    private Student next;   // ссылка на следующий узел
    private Student prev;   // ссылка на предыдущий узел

    public Student() {
    }

    public Student(String firstName, String lastName, String group, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.gpa = gpa;
    }

    // считать атрибуты с консоли
    public void read(Scanner sc) {
        System.out.print("Имя: ");
        firstName = sc.nextLine();
        System.out.print("Фамилия: ");
        lastName = sc.nextLine();
        System.out.print("Группа: ");
        group = sc.nextLine();
        System.out.print("Средний балл: ");
        gpa = Double.parseDouble(sc.nextLine().replace(',', '.'));
    }

    // вывести атрибуты на экран
    public void print() {
        System.out.println(lastName + " " + firstName + ", группа " + group + ", балл " + gpa);
    }

    public Student getNext() {
        return next;
    }

    public void setNext(Student next) {
        this.next = next;
    }

    public Student getPrev() {
        return prev;
    }

    public void setPrev(Student prev) {
        this.prev = prev;
    }
}