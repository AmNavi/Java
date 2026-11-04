import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Task1 {
    public static void main(String[] args) {
        String surname = "Иванова"; // фамилия разработчика

        // дату получения задания задаю сама
        Calendar cal = new GregorianCalendar(2026, Calendar.OCTOBER, 20, 10, 30, 0);
        Date getDate = cal.getTime();

        // дата сдачи - текущая
        Date doneDate = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        System.out.println("Разработчик: " + surname);
        System.out.println("Задание получено: " + sdf.format(getDate));
        System.out.println("Задание сдано: " + sdf.format(doneDate));
    }
}