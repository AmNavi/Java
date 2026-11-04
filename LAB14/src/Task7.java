import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
    public static void main(String[] args) {
        // (?=...) проверяет, что в пароле есть заглавная, маленькая буква и цифра
        // потом идут 8 и более символов: буквы, цифры, подчеркивание
        Pattern p = Pattern.compile("(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9_]{8,}");

        String[] tests = {"F032_Password", "TrySpy1", "smart_pass", "A007"};

        for (String s : tests) {
            Matcher m = p.matcher(s);
            if (m.matches()) {
                System.out.println(s + " - пароль надежный");
            } else {
                System.out.println(s + " - пароль ненадежный");
            }
        }
    }
}
