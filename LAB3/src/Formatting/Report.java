package Formatting;

public class Report {

    public static void generateReport(Employee[] employees) {

        System.out.println("Отчет о сотрудниках");
        System.out.println("------------------------------");

        for (int i = 0; i < employees.length; i++) {

            // Выводим имя и зарплату с форматированием
            System.out.printf("%-20s %10.2f%n",
                    employees[i].getFullname(),
                    employees[i].getSalary());
        }
    }

    public static void main(String[] args) {

        Employee[] employees = new Employee[3];

        employees[0] = new Employee("Иванов Иван", 50000);
        employees[1] = new Employee("Петров Петр", 65000.50);
        employees[2] = new Employee("Сидорова Анна", 72000.75);

        generateReport(employees);
    }
}
