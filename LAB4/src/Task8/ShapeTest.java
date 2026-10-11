package Task8;

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false); // upcast
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());

        Circle c1 = (Circle) s1; // downcast
        System.out.println(c1.getRadius());

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println(s3);
        System.out.println(s3.getArea());

        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());

        Rectangle r2 = (Rectangle) s4; // downcast к родителю Square
        System.out.println(r2.getLength());
    }
}
