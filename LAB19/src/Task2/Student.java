package Task2;

public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGpa() {
        return gpa;
    }

    // Сравнение студентов по фамилии
    public int compareTo(Student other) {
        return lastName.compareTo(other.lastName);
    }

    public String toString() {
        return lastName + " " + firstName + ", средний балл: " + gpa;
    }
}
