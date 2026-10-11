package Task6;

public class Main {
    public static void main(String[] args) {
        // переменная типа Employer ссылается на Manager
        Employer e = new Manager("Иван", "Петров", 50000, 10000);
        System.out.println(e.getIncome());

        Employer[] workers = new Employer[2];
        workers[0] = new Employer("Анна", "Сидорова", 40000);
        workers[1] = new Manager("Олег", "Смирнов", 50000, 15000);

        for (Employer w : workers) {
            System.out.println(w.firstName + " " + w.lastName + ": " + w.getIncome());
        }
    }
}
