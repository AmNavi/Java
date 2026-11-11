package Task2;

// контейнерный класс - двусвязный список студентов
public class StudentList {
    private Student begin; // ссылка на первый узел
    private Student end;   // ссылка на последний узел
    private int size;      // количество узлов

    // создание пустого списка
    public StudentList() {
        begin = null;
        end = null;
        size = 0;
    }

    // проверка списка на пустоту
    public boolean isEmpty() {
        return begin == null;
    }

    public int getSize() {
        return size;
    }

    // добавление узла в конец списка
    public void add(Student s) {
        s.setNext(null);
        s.setPrev(end);
        if (end == null) {
            begin = s;
        } else {
            end.setNext(s);
        }
        end = s;
        size++;
    }

    // поиск узла по номеру (нумерация с 1)
    private Student getNode(int index) {
        Student cur = begin;
        for (int i = 1; i < index; i++) {
            cur = cur.getNext();
        }
        return cur;
    }

    // удаление узла по номеру
    public boolean remove(int index) {
        if (index < 1 || index > size) {
            return false;
        }
        Student cur = getNode(index);
        if (cur.getPrev() == null) {
            begin = cur.getNext();            // удаляем первый узел
        } else {
            cur.getPrev().setNext(cur.getNext());
        }
        if (cur.getNext() == null) {
            end = cur.getPrev();              // удаляем последний узел
        } else {
            cur.getNext().setPrev(cur.getPrev());
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
        getNode(index).print();
    }

    // вывод списка от начала к концу (по ссылкам next)
    public void printAll() {
        if (isEmpty()) {
            System.out.println("Список пуст");
            return;
        }
        Student cur = begin;
        int number = 1;
        while (cur != null) {
            System.out.print(number + ". ");
            cur.print();
            cur = cur.getNext();
            number++;
        }
    }

    // вывод списка от конца к началу (по ссылкам prev)
    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Список пуст");
            return;
        }
        Student cur = end;
        int number = size;
        while (cur != null) {
            System.out.print(number + ". ");
            cur.print();
            cur = cur.getPrev();
            number--;
        }
    }

    // очистка списка
    public void clear() {
        begin = null;
        end = null;
        size = 0;
    }
}