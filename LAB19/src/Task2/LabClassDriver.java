package Task2;

public class LabClassDriver {
    public static void main(String[] args) {

        // Массив интерфейсных ссылок
        Comparable[] students = {
                new Student("Анна", "Петрова", 4.5),
                new Student("Иван", "Сидоров", 3.8),
                new Student("Олег", "Андреев", 4.9),
                new Student("Мария", "Кузнецова", 4.1),
                new Student("Егор", "Волков", 3.5)
        };

        LabClass labClass = new LabClass(students);
        LabClassUI ui = new LabClassUI(labClass);

        ui.start();
    }
}
