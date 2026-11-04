import java.util.Scanner;

public class Task16 {



        // Scanner сделала static, потому что параметры в функцию передавать нельзя
        static Scanner sc = new Scanner(System.in);

        // читает числа до 0, возвращает {максимум, сколько раз он встретился}
        public static int[] maxAndCount() {
            int n = sc.nextInt();
            // базовый случай - дошли до нуля
            if (n == 0) {
                return new int[]{0, 0};
            }
            // шаг рекурсии - читаем остальные числа
            int[] rest = maxAndCount();
            if (n > rest[0]) {
                return new int[]{n, 1};
            } else if (n == rest[0]) {
                return new int[]{n, rest[1] + 1};
            } else {
                return rest;
            }
        }

        public static void main(String[] args) {
            int[] result = maxAndCount();
            System.out.println(result[1]);
        }

}
