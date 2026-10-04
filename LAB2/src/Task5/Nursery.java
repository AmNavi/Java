package Task5;

public class Nursery {
    public static void main(String[] args) {

        // Создаем несколько собак
        Dog[] dogs = new Dog[3];

        dogs[0] = new Dog("Bobik", 3);
        dogs[1] = new Dog("Sharik", 5);
        dogs[2] = new Dog("Rex", 2);

        for (int i = 0; i < dogs.length; i++) {

            System.out.println(dogs[i]);
            System.out.println("Человеческий возраст: "
                    + dogs[i].getHumanAge());
        }
    }
}
