package Task1;

public class SeasonTest {

    static void printLove(Season season) {
        switch (season) {
            case WINTER: System.out.println("Я люблю зиму"); break;
            case SPRING: System.out.println("Я люблю весну"); break;
            case SUMMER: System.out.println("Я люблю лето"); break;
            case AUTUMN: System.out.println("Я люблю осень"); break;
        }
    }

    public static void main(String[] args) {
        Season favorite = Season.SUMMER;
        System.out.println(favorite + " " + favorite.getAverageTemp() + " " + favorite.getDescription());

        printLove(favorite);

        // выводим все времена года
        for (Season s : Season.values()) {
            System.out.println(s + ", температура: " + s.getAverageTemp() + ", " + s.getDescription());
        }
    }
}
