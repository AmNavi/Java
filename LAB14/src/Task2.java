import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("abcdefghijklmnopqrstuv18340");

        String[] tests = {
                "abcdefghijklmnopqrstuv18340",
                "abcdefghijklmnoasdfasdpqrstuv18340"
        };

        for (String s : tests) {
            Matcher m = p.matcher(s);
            System.out.println(s + " -> " + m.matches());
        }
    }
}