package Task1;

import java.util.Comparator;

// сравнение студентов по среднему баллу, по убыванию
public class GpaComparator implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return Double.compare(b.getGpa(), a.getGpa());
    }
}