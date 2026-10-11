package Task1;

public enum Season {
    WINTER(-10),
    SPRING(5),
    SUMMER(25) {
        // для лета переопределяем метод
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(8);

    private final int averageTemp;

    private Season(int averageTemp) {
        this.averageTemp = averageTemp;
    }

    public int getAverageTemp() {
        return averageTemp;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
