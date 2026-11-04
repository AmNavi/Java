import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        System.out.print("Введите дату (дд.мм.гггг): ");
        String line = sc.nextLine();

        try {
            Date entered = sdf.parse(line);
            Date now = new Date(); // текущая дата

            System.out.println("Текущая дата: " + sdf.format(now));
            System.out.println("Введенная дата: " + sdf.format(entered));

            if (entered.before(now)) {
                System.out.println("Введенная дата раньше текущей");
            } else if (entered.after(now)) {
                System.out.println("Введенная дата позже текущей");
            } else {
                System.out.println("Даты равны");
            }
        } catch (ParseException e) {
            System.out.println("Неверный формат даты");
        }
    }
}