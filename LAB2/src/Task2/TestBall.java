package Task2;

public class TestBall {
    public static void main(String[] args) {

        Ball ball = new Ball(2.0, 3.0);

        System.out.println(ball);

        ball.setX(5.0);
        ball.setY(6.0);

        System.out.println(ball);

        // Перемещаем мяч
        ball.move(2.0, 3.0);

        System.out.println("После перемещения:");
        System.out.println(ball);
    }
}
