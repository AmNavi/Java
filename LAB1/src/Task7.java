public class Task7 {

    // Метод для вычисления факториала
    public static int factorial(int n) {

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        return result;
    }

    public static void main(String[] args) {

        int number = 5;

        // Проверяем работу метода
        int result = factorial(number);

        System.out.println("Факториал числа " + number + " = " + result);
    }
}
