package Task2;

import java.util.Arrays;
import java.util.Comparator;

public class LabClass {
    private Comparable[] students;

    public LabClass(Comparable[] students) {
        this.students = students;
    }

    // Поиск студента по ФИО
    public Student findStudent(String name)
            throws EmptyStringException, StudentNotFoundException {

        if (name == null || name.trim().isEmpty()) {
            throw new EmptyStringException("Пустая строка для поиска");
        }

        for (Comparable student : students) {
            Student s = (Student) student;

            String fullName = s.getLastName() + " " + s.getFirstName();

            if (fullName.equalsIgnoreCase(name.trim())) {
                return s;
            }
        }

        throw new StudentNotFoundException("Студент не найден");
    }

    // Сортировка по среднему баллу
    public void sortStudents() {
        Arrays.sort(students, new Comparator<Comparable>() {
            public int compare(Comparable a, Comparable b) {
                Student first = (Student) a;
                Student second = (Student) b;

                return Double.compare(second.getGpa(), first.getGpa());
            }
        });
    }

    public void printStudents() {
        for (Comparable student : students) {
            System.out.println(student);
        }
    }
}
