package Task3;

public class Animal implements Nameable {
    private String nickname;

    public Animal(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String getName() {
        return nickname;
    }
}
