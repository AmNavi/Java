package Task4;

public class Shop {

    private Computer[] computers;
    private int count;

    public Shop(int size) {
        computers = new Computer[size];
        count = 0;
    }

    // Добавляем компьютер
    public void addComputer(Computer computer) {
        if (count < computers.length) {
            computers[count] = computer;
            count++;
        }
    }

    // Удаляем компьютер
    public void removeComputer(int index) {
        if (index >= 0 && index < count) {

            for (int i = index; i < count - 1; i++) {
                computers[i] = computers[i + 1];
            }

            computers[count - 1] = null;
            count--;
        }
    }

    // Ищем компьютер по названию
    public Computer findComputer(String name) {

        for (int i = 0; i < count; i++) {

            if (computers[i].getName().equals(name)) {
                return computers[i];
            }
        }

        return null;
    }

    public void printComputers() {

        for (int i = 0; i < count; i++) {
            System.out.println(i + " - " + computers[i]);
        }
    }
}
