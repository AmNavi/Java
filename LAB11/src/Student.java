import java.text.DateFormat;
import java.util.Date;

public class Student {
    private String firstName;
    private String lastName;
    private String speciality;
    private int course;
    private String group;
    private Date birthDate; // дата рождения

    public Student(String firstName, String lastName, String speciality, int course, String group, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
        this.birthDate = birthDate;
    }

    public Date getBirthDate() { return birthDate; }
    public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }

    // возвращает дату рождения в нужном формате:
    // DateFormat.SHORT, DateFormat.MEDIUM или DateFormat.FULL
    public String getBirthDateString(int style) {
        DateFormat df = DateFormat.getDateInstance(style);
        return df.format(birthDate);
    }

    public String toString() {
        return lastName + " " + firstName + ", " + speciality + ", курс " + course
                + ", группа " + group + ", дата рождения: " + getBirthDateString(DateFormat.MEDIUM);
    }
}
