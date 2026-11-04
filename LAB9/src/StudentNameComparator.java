import java.util.Comparator;

// второй компаратор - по фамилии
public class StudentNameComparator implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.getLastName().compareTo(b.getLastName());
    }
}
