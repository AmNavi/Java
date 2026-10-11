package Task3;

public class Main {
    public static void main(String[] args) {
        Nameable[] objects = new Nameable[3];
        objects[0] = new Planet("Марс");
        objects[1] = new Car("Toyota");
        objects[2] = new Animal("Барсик");

        for (Nameable n : objects) {
            System.out.println(n.getName());
        }
    }
}
