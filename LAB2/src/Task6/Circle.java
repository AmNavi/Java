package Task6;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Площадь круга
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Длина окружности
    public double getLength() {
        return 2 * Math.PI * radius;
    }

    // Сравнение двух окружностей
    public int compare(Circle circle) {

        if (this.radius > circle.radius) {
            return 1;
        }

        if (this.radius < circle.radius) {
            return -1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "Circle{radius=" + radius + "}";
    }
}
