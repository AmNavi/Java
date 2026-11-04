public class MergeStudentLists {
    // объединяем два списка в один отсортированный
    public static Student[] merge(Student[] a, Student[] b) {
        Student[] all = new Student[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            all[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            all[a.length + i] = b[i];
        }
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.mergeSort(all); // сортировка слиянием по баллу
        return all;
    }

    public static void main(String[] args) {
        Student[] list1 = new Student[3];
        list1[0] = new Student("Анна", "Петрова", "Информатика", 2, "ИКБО-01-24", 4.5);
        list1[1] = new Student("Иван", "Сидоров", "Информатика", 2, "ИКБО-01-24", 3.8);
        list1[2] = new Student("Олег", "Андреев", "Математика", 3, "ИКБО-05-23", 4.9);

        Student[] list2 = new Student[2];
        list2[0] = new Student("Мария", "Кузнецова", "Математика", 3, "ИКБО-05-23", 4.1);
        list2[1] = new Student("Егор", "Волков", "Физика", 1, "ИКБО-10-25", 3.5);

        Student[] result = merge(list1, list2);
        for (Student s : result) {
            System.out.println(s);
        }
    }
}
