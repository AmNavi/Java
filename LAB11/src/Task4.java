import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите год, месяц, число: ");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        System.out.print("Введите часы и минуты: ");
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        // месяцы в Calendar идут с 0, поэтому month - 1
        Calendar cal = new GregorianCalendar(year, month - 1, day, hour, minute);
        Date date = cal.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        System.out.println("Date: " + sdf.format(date));
        System.out.println("Calendar: " + cal.get(Calendar.DAY_OF_MONTH) + "."
                + (cal.get(Calendar.MONTH) + 1) + "." + cal.get(Calendar.YEAR) + " "
                + cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE));
    }
}