import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        // год от 1900 до 9999
        String year = "(19|[2-9][0-9])[0-9]{2}";
        // високосный год (делится на 4, но не на 100, или делится на 400)
        String leapYear = "((19|[2-9][0-9])(0[48]|[2468][048]|[13579][26])|([2468][048]|[3579][26])00)";

        // дни 01-28 в любом месяце
        String d1 = "(0[1-9]|1[0-9]|2[0-8])/(0[1-9]|1[0-2])/" + year;
        // дни 29 и 30 во всех месяцах кроме февраля
        String d2 = "(29|30)/(0[13-9]|1[0-2])/" + year;
        // 31 число в месяцах, где 31 день
        String d3 = "31/(0[13578]|1[02])/" + year;
        // 29 февраля только в високосный год
        String d4 = "29/02/" + leapYear;

        Pattern p = Pattern.compile(d1 + "|" + d2 + "|" + d3 + "|" + d4);

        String[] tests = {"29/02/2000", "30/04/2003", "01/01/2003",
                "29/02/2001", "30-04-2003", "1/1/1899"};

        for (String s : tests) {
            Matcher m = p.matcher(s);
            System.out.println(s + " -> " + m.matches());
        }
    }
}
