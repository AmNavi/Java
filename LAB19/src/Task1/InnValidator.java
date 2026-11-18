package Task1;

public class InnValidator {

    public static void checkInn(String inn) throws InvalidInnException {
        if (inn == null || !inn.matches("\\d{10}|\\d{12}")) {
            throw new InvalidInnException("Неверный ИНН");
        }
    }
}