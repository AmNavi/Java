public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("Иванов", "Иван", "Петрович");
        Person p2 = new Person("Петров", "Петр", null);
        Person p3 = new Person("Сидоров", null, "Андреевич");
        Person p4 = new Person("Кузнецов", null, null);

        System.out.println(p1.getShortName());
        System.out.println(p2.getShortName());
        System.out.println(p3.getShortName());
        System.out.println(p4.getShortName());
    }
}
