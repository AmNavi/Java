package Task1;

import java.util.ArrayList;

public class ArrayConverter {

    // Переносим элементы массива в список
    public static <T> ArrayList<T> arrayToList(T[] array) {
        ArrayList<T> list = new ArrayList<>();

        for (T element : array) {
            list.add(element);
        }

        return list;
    }

    public static void main(String[] args) {
        String[] words = {"один", "два", "три"};
        Integer[] numbers = {10, 20, 30};

        ArrayList<String> wordList = arrayToList(words);
        ArrayList<Integer> numberList = arrayToList(numbers);

        System.out.println(wordList);
        System.out.println(numberList);
    }
}
