public class PhoneFormatter {
    public static String format(String phone) {
        String digits;
        if (phone.startsWith("+")) {
            digits = phone.substring(1);
        } else if (phone.startsWith("8") && phone.length() == 11) {
            digits = "7" + phone.substring(1); // для России 8 заменяем на код 7
        } else {
            return "Неверный формат";
        }

        // должны быть только цифры и больше 10 (10 цифр номера + код страны)
        if (!digits.matches("\\d+") || digits.length() <= 10) {
            return "Неверный формат";
        }

        int codeLength = digits.length() - 10;
        String code = digits.substring(0, codeLength);
        String number = digits.substring(codeLength);

        return "+" + code + number.substring(0, 3) + "-" + number.substring(3, 6)
                + "-" + number.substring(6);
    }

    public static void main(String[] args) {
        System.out.println(format("+79175655655"));
        System.out.println(format("+104289652211"));
        System.out.println(format("89175655655"));
        System.out.println(format("12345"));
    }
}
