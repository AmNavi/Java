import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = sc.nextInt();

        int k = 1;     // число, которое сейчас выводим
        int count = 0; // сколько раз уже вывели это число

        for (int i = 0; i < n; i++) {
            System.out.print(k + " ");
            count++;
            // если число выведено k раз, переходим к следующему
            if (count == k) {
                k++;
                count = 0;
            }
        }
        System.out.println();
    }
}