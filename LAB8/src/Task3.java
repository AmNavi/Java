import java.util.Scanner;

public class Task3 {
    public static void printAB(int a, int b) {
        System.out.print(a + " ");
        if (a == b) {
            return; // дошли до B, останавливаемся
        }
        if (a < b) {
            printAB(a + 1, b); // идем вверх
        } else {
            printAB(a - 1, b); // идем вниз
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        printAB(a, b);
        System.out.println();
    }
}
