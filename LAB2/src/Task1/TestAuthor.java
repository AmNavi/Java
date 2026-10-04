package Task1;

public class TestAuthor {
    public static void main(String[] args) {

        // Создаем автора
        Author author = new Author("Anastasia", "oslopova_nv@mail.ru", 'f');

        System.out.println(author);

        System.out.println("Имя: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Пол: " + author.getGender());

        // Меняем email
        author.setEmail("newmail@mail.ru");

        System.out.println("Новый email: " + author.getEmail());
    }
}
