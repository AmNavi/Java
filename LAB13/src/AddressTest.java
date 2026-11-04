public class AddressTest {
    public static void main(String[] args) {
        String[] a = {
                "Россия, Московская область, Москва, Ленина, 10, 2, 5",
                "Россия,  Тверская область ,Тверь, Мира,5,1,12",
                "Беларусь, Минская область, Минск, Победы, 7, 3, 44",
                "Россия, Омская область, Омск, Гагарина, 21, 1, 8"
        };
        System.out.println("Вариант а) split:");
        for (String s : a) {
            Address address = new Address();
            address.parseSplit(s);
            System.out.println(address);
        }

        String[] b = {
                "Россия; Московская область. Москва, Ленина; 10. 2, 5",
                "Россия, Тверская область; Тверь. Мира, 5; 1. 12",
                "Беларусь. Минская область, Минск; Победы, 7. 3; 44",
                "Россия; Омская область; Омск; Гагарина; 21; 1; 8"
        };
        System.out.println("Вариант б) StringTokenizer:");
        for (String s : b) {
            Address address = new Address();
            address.parseTokenizer(s);
            System.out.println(address);
        }
    }
}
