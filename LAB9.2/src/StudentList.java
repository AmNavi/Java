import java.util.Comparator;

// контейнерный класс - односвязный список студентов
public class StudentList {
    private Student head; // ссылка на первый узел
    private int size;     // количество узлов

    // создание пустого списка
    public StudentList() {
        head = null;
        size = 0;
    }

    // проверка списка на пустоту
    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    // добавление узла в конец списка
    public void add(Student s) {
        s.setNext(null);
        if (head == null) {
            head = s;
        } else {
            Student cur = head;
            while (cur.getNext() != null) {
                cur = cur.getNext();
            }
            cur.setNext(s);
        }
        size++;
    }

    // удаление узла по номеру (нумерация с 1)
    public boolean remove(int index) {
        if (index < 1 || index > size) {
            return false;
        }
        if (index == 1) {
            head = head.getNext();
        } else {
            Student prev = head;
            for (int i = 1; i < index - 1; i++) {
                prev = prev.getNext();
            }
            prev.setNext(prev.getNext().getNext());
        }
        size--;
        return true;
    }

    // вывод одного узла по номеру
    public void printElement(int index) {
        if (index < 1 || index > size) {
            System.out.println("Нет элемента с таким номером");
            return;
        }
        Student cur = head;
        for (int i = 1; i < index; i++) {
            cur = cur.getNext();
        }
        cur.print();
    }

    // вывод всего списка
    public void printAll() {
        if (isEmpty()) {
            System.out.println("Список пуст");
            return;
        }
        Student cur = head;
        int number = 1;
        while (cur != null) {
            System.out.print(number + ". ");
            cur.print();
            cur = cur.getNext();
            number++;
        }
    }

    // очистка списка
    public void clear() {
        head = null;
        size = 0;
    }

    // сортировка слиянием
    public void mergeSort(Comparator<Student> c) {
        head = sort(head, c);
    }

    // объединение двух списков в один отсортированный
    public void mergeWith(StudentList other, Comparator<Student> c) {
        head = merge(sort(head, c), sort(other.head, c), c);
        size = size + other.size;
        other.head = null;
        other.size = 0;
    }

    // рекурсивная сортировка слиянием: возвращает начало отсортированного списка
    private Student sort(Student first, Comparator<Student> c) {
        if (first == null || first.getNext() == null) {
            return first; // базовый случай: 0 или 1 узел
        }
        Student middle = getMiddle(first);
        Student second = middle.getNext();
        middle.setNext(null);                 // делим список на две части
        Student left = sort(first, c);        // шаг рекурсии
        Student right = sort(second, c);      // шаг рекурсии
        return merge(left, right, c);         // слияние
    }

    // находим середину списка (быстрый и медленный указатели)
    private Student getMiddle(Student first) {
        Student slow = first;
        Student fast = first.getNext();
        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return slow;
    }

    // рекурсивное слияние двух отсортированных списков
    private Student merge(Student a, Student b, Comparator<Student> c) {
        if (a == null) {
            return b; // базовый случай
        }
        if (b == null) {
            return a; // базовый случай
        }
        if (c.compare(a, b) <= 0) {
            a.setNext(merge(a.getNext(), b, c));
            return a;
        } else {
            b.setNext(merge(a, b.getNext(), c));
            return b;
        }
    }
}
