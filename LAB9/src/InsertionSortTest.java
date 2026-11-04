public class InsertionSortTest {
    public static void main(String[] args) {
        Student[] iDNumber = new Student[5];
        iDNumber[0] = new Student("Анна", "Петрова", "Информатика", 2, "ИКБО-01-24", 4.5);
        iDNumber[1] = new Student("Иван", "Сидоров", "Информатика", 2, "ИКБО-01-24", 3.8);
        iDNumber[2] = new Student("Олег", "Андреев", "Математика", 3, "ИКБО-05-23", 4.9);
        iDNumber[3] = new Student("Мария", "Кузнецова", "Математика", 3, "ИКБО-05-23", 4.1);
        iDNumber[4] = new Student("Егор", "Волков", "Физика", 1, "ИКБО-10-25", 3.5);

        System.out.println("До сортировки:");
        for (Student s : iDNumber) {
            System.out.println(s);
        }

        Sorting.insertionSort(iDNumber);

        System.out.println("После сортировки вставками:");
        for (Student s : iDNumber) {
            System.out.println(s);
        }
    }
}
