public class Sorting {
    // сортировка вставками для любых объектов Comparable
    public static void insertionSort(Comparable[] list) {
        for (int i = 1; i < list.length; i++) {
            Comparable key = list[i]; // элемент, который вставляем
            int j = i - 1;
            // сдвигаем элементы, которые больше key
            while (j >= 0 && list[j].compareTo(key) > 0) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
        }
    }
}
