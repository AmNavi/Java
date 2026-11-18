package Task2;

import java.lang.reflect.Array;

public class GenericArray<T> {
    private Object array;
    private int length;

    public GenericArray(Object array) {
        if (!array.getClass().isArray()) {
            throw new IllegalArgumentException("Это не массив");
        }

        this.array = array;
        this.length = Array.getLength(array);
    }

    public int getLength() {
        return length;
    }

    // Получаем элемент по индексу
    @SuppressWarnings("unchecked")
    public T getElement(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Неверный индекс");
        }

        return (T) Array.get(array, index);
    }
}
