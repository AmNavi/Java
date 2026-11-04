public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private String speciality;
    private int course;
    private String group;
    private double gpa; // средний балл, нужен для сортировки

    public Student(String firstName, String lastName, String speciality, int course, String group, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getSpeciality() { return speciality; }
    public void setSpeciality(String speciality) { this.speciality = speciality; }
    public int getCourse() { return course; }
    public void setCourse(int course) { this.course = course; }
    public String getGroup() { return group; }
    public void setGroup(String group) { this.group = group; }
    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }

    // сравниваем студентов по фамилии
    public int compareTo(Student other) {
        return lastName.compareTo(other.lastName);
    }

    public String toString() {
        return lastName + " " + firstName + ", " + speciality + ", курс " + course
                + ", группа " + group + ", балл " + gpa;
    }
}