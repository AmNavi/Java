import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    private Student[] iDNumber;

    // сравнение по среднему баллу, по убыванию
    public int compare(Student a, Student b) {
        return Double.compare(b.getGpa(), a.getGpa());
    }

    // заполнение массива
    public void setArray() {
        iDNumber = new Student[5];
        iDNumber[0] = new Student("Анна", "Петрова", "Информатика", 2, "ИКБО-01-24", 4.5);
        iDNumber[1] = new Student("Иван", "Сидоров", "Информатика", 2, "ИКБО-01-24", 3.8);
        iDNumber[2] = new Student("Олег", "Андреев", "Математика", 3, "ИКБО-05-23", 4.9);
        iDNumber[3] = new Student("Мария", "Кузнецова", "Математика", 3, "ИКБО-05-23", 4.1);
        iDNumber[4] = new Student("Егор", "Волков", "Физика", 1, "ИКБО-10-25", 3.5);
    }

    // быстрая сортировка по среднему баллу
    public void quicksort() {
        qSort(iDNumber, 0, iDNumber.length - 1, this);
    }

    // сортировка слиянием по среднему баллу
    public void mergeSort() {
        mSort(iDNumber, 0, iDNumber.length - 1, this);
    }

    // сортировка слиянием для любого массива студентов
    public void mergeSort(Student[] arr) {
        mSort(arr, 0, arr.length - 1, this);
    }

    // сортировка по другому полю - по фамилии
    public void sortByLastName() {
        qSort(iDNumber, 0, iDNumber.length - 1, new StudentNameComparator());
    }

    public void outArray() {
        for (Student s : iDNumber) {
            System.out.println(s);
        }
        System.out.println();
    }

    private void qSort(Student[] a, int low, int high, Comparator<Student> c) {
        if (low < high) {
            Student pivot = a[high]; // опорный элемент
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (c.compare(a[j], pivot) <= 0) {
                    i++;
                    swap(a, i, j);
                }
            }
            swap(a, i + 1, high);
            qSort(a, low, i, c);       // левая часть
            qSort(a, i + 2, high, c);  // правая часть
        }
    }

    private void swap(Student[] a, int i, int j) {
        Student temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private void mSort(Student[] a, int left, int right, Comparator<Student> c) {
        if (left < right) {
            int mid = (left + right) / 2;
            mSort(a, left, mid, c);
            mSort(a, mid + 1, right, c);
            merge(a, left, mid, right, c);
        }
    }

    // объединяем две отсортированные половины
    private void merge(Student[] a, int left, int mid, int right, Comparator<Student> c) {
        Student[] tmp = new Student[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= right) {
            if (c.compare(a[i], a[j]) <= 0) {
                tmp[k++] = a[i++];
            } else {
                tmp[k++] = a[j++];
            }
        }
        while (i <= mid) {
            tmp[k++] = a[i++];
        }
        while (j <= right) {
            tmp[k++] = a[j++];
        }
        for (int t = 0; t < tmp.length; t++) {
            a[left + t] = tmp[t];
        }
    }

    public static void main(String[] args) {
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();

        sorter.setArray();
        System.out.println("До сортировки:");
        sorter.outArray();

        sorter.quicksort();
        System.out.println("Быстрая сортировка по баллу (по убыванию):");
        sorter.outArray();

        sorter.setArray();
        sorter.mergeSort();
        System.out.println("Сортировка слиянием по баллу (по убыванию):");
        sorter.outArray();

        sorter.sortByLastName();
        System.out.println("Сортировка по фамилии:");
        sorter.outArray();
    }
}
