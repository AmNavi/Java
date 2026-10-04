import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        double[] numbers1 = new double[5];

        // Заполняем массив с помощью Math.random()
        for (int i = 0; i < numbers1.length; i++) {
            numbers1[i] = Math.random() * 100;
        }

        System.out.println("Массив Math.random():");

        for (int i = 0; i < numbers1.length; i++) {
            System.out.printf("%.2f ", numbers1[i]);
        }

        System.out.println();

        // Сортируем массив
        for (int i = 0; i < numbers1.length - 1; i++) {

            for (int j = 0; j < numbers1.length - 1 - i; j++) {

                if (numbers1[j] > numbers1[j + 1]) {

                    double temp = numbers1[j];
                    numbers1[j] = numbers1[j + 1];
                    numbers1[j + 1] = temp;
                }
            }
        }

        System.out.println("После сортировки:");

        for (int i = 0; i < numbers1.length; i++) {
            System.out.printf("%.2f ", numbers1[i]);
        }

        System.out.println();
        System.out.println();

        // Второй способ - класс Random
        Random random = new Random();

        double[] numbers2 = new double[5];

        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = random.nextDouble() * 100;
        }

        System.out.println("Массив Random:");

        for (int i = 0; i < numbers2.length; i++) {
            System.out.printf("%.2f ", numbers2[i]);
        }
    }
}
