package Task2;

public class GenericArrayTest {
    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 30, 40};
        String[] words = {"один", "два", "три"};
        int[] values = {5, 15, 25};

        GenericArray<Integer> numberArray = new GenericArray<>(numbers);
        GenericArray<String> wordArray = new GenericArray<>(words);
        GenericArray<Integer> intArray = new GenericArray<>(values);

        System.out.println(numberArray.getElement(1));
        System.out.println(wordArray.getElement(0));
        System.out.println(intArray.getElement(2));
    }
}
