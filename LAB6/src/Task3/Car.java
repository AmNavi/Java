package Task3;

public class Car implements Nameable {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public String getName() {
        return model;
    }
}
