package Task4;

public class MinMaxTest {
    public static void main(String[] args) {
        Integer[] numbers = {5, 2, 9, 1, 7};

        MinMax<Integer> minMax = new MinMax<>(numbers);

        System.out.println("Минимум: " + minMax.findMin());
        System.out.println("Максимум: " + minMax.findMax());

        System.out.println("Сумма: " + Calculator.sum(10, 5.5));
        System.out.println("Умножение: " + Calculator.multiply(10, 5.5));
        System.out.println("Деление: " + Calculator.divide(10, 5.0));
        System.out.println("Вычитание: " + Calculator.subtraction(10, 5.5));
    }
}
