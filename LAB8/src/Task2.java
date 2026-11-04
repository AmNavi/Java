import java.util.Scanner;

public class Task2 {
    // выводит числа от i до n
    public static void printNumbers(int i, int n) {
        if (i > n) {
            return; // базовый случай
        }
        System.out.print(i + " ");
        printNumbers(i + 1, n); // шаг рекурсии
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumbers(1, n);
        System.out.println();
    }
}
