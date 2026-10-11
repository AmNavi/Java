package Task6;

public class Manager extends Employer {
    private double averageSum; // дополнительные выплаты от продаж

    public Manager(String firstName, String lastName, double income, double averageSum) {
        super(firstName, lastName, income); // вызываем конструктор родителя
        this.averageSum = averageSum;
    }

    @Override
    public double getIncome() {
        return super.getIncome() + averageSum;
    }
}
