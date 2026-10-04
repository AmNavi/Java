public class WrapperTask1 {
    public static void main(String[] args) {

        // Создаем объект Double через valueOf()
        Double number1 = Double.valueOf(3.14);
        Double number2 = Double.valueOf("5.5");

        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);

        // Преобразуем String в double
        String text = "10.5";
        double number3 = Double.parseDouble(text);

        System.out.println("double = " + number3);

        // Преобразуем Double в примитивные типы
        double a = number1.doubleValue();
        int b = number1.intValue();
        float c = number1.floatValue();
        long d = number1.longValue();
        short e = number1.shortValue();
        byte f = number1.byteValue();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        // Выводим Double
        System.out.println(number1);

        // double в String
        String result = Double.toString(3.14);

        System.out.println(result);
    }
}