package Task2;

public class Circle {

    private Point center;
    private double radius;
    private double length;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;

        // Считаем длину окружности
        this.length = 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Circle{center=" + center
                + ", radius=" + radius
                + ", length=" + length + "}";
    }
}
