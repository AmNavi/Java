package Task3;

public class Tester {
    public static void main(String[] args) {

        // Создаем массив окружностей
        Circle[] circles = new Circle[3];

        circles[0] = new Circle(new Point(1, 2), 5);
        circles[1] = new Circle(new Point(3, 4), 2);
        circles[2] = new Circle(new Point(5, 6), 7);

        int count = circles.length;

        for (int i = 0; i < count; i++) {
            System.out.println(circles[i]);
        }
    }
}
