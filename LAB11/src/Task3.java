import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Task3 {
    public static void main(String[] args) {
        Date birth = new GregorianCalendar(2005, Calendar.MARCH, 15).getTime();
        Student s = new Student("Анна", "Петрова", "Информатика", 2, "ИКБО-01-24", birth);

        System.out.println(s);
        System.out.println("Короткий формат: " + s.getBirthDateString(DateFormat.SHORT));
        System.out.println("Средний формат: " + s.getBirthDateString(DateFormat.MEDIUM));
        System.out.println("Полный формат: " + s.getBirthDateString(DateFormat.FULL));
    }
}