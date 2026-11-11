public class MergeListsTest {
    public static void main(String[] args) {
        StudentList list1 = new StudentList();
        list1.add(new Student("Анна", "Петрова", "ИКБО-01-24", 4.5));
        list1.add(new Student("Иван", "Сидоров", "ИКБО-01-24", 3.8));
        list1.add(new Student("Олег", "Андреев", "ИКБО-05-23", 4.9));

        StudentList list2 = new StudentList();
        list2.add(new Student("Мария", "Кузнецова", "ИКБО-05-23", 4.1));
        list2.add(new Student("Егор", "Волков", "ИКБО-10-25", 3.5));
        list2.add(new Student("Дарья", "Орлова", "ИКБО-10-25", 4.7));

        System.out.println("Первый список:");
        list1.printAll();
        System.out.println("Второй список:");
        list2.printAll();

        // объединяем списки в один, отсортированный по баллу (по убыванию)
        list1.mergeWith(list2, new GpaComparator());

        System.out.println("Объединенный отсортированный список:");
        list1.printAll();
        System.out.println("Второй список после объединения:");
        list2.printAll();
    }
}