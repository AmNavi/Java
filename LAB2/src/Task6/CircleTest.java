package Task6;

public class CircleTest {
    public static void main(String[] args) {

        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(3);

        System.out.println(circle1);
        System.out.println("Площадь = " + circle1.getArea());
        System.out.println("Длина = " + circle1.getLength());

        // Сравниваем окружности
        int result = circle1.compare(circle2);

        if (result > 0) {
            System.out.println("Первая окружность больше");
        } else if (result < 0) {
            System.out.println("Первая окружность меньше");
        } else {
            System.out.println("Окружности одинаковые");
        }
    }
}
