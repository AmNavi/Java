import java.util.Scanner;

public class Task17 {
    static Scanner sc = new Scanner(System.in);

    // возвращает максимум последовательности
    public static int max() {
        int n = sc.nextInt();
        if (n == 0) {
            return 0; // базовый случай
        }
        int m = max(); // максимум среди оставшихся чисел
        if (n > m) {
            return n;
        } else {
            return m;
        }
    }

    public static void main(String[] args) {
        System.out.println(max());
    }
}
