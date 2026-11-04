import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String flat;

    // а) разделитель только запятая, используем split()
    public void parseSplit(String str) {
        String[] parts = str.split(",");
        if (parts.length < 7) {
            System.out.println("Неверный адрес: " + str);
            return;
        }
        country = parts[0].trim();
        region = parts[1].trim();
        city = parts[2].trim();
        street = parts[3].trim();
        house = parts[4].trim();
        building = parts[5].trim();
        flat = parts[6].trim();
    }

    // б) разделитель любой из , . ; используем StringTokenizer
    public void parseTokenizer(String str) {
        StringTokenizer st = new StringTokenizer(str, ",.;");
        if (st.countTokens() < 7) {
            System.out.println("Неверный адрес: " + str);
            return;
        }
        country = st.nextToken().trim();
        region = st.nextToken().trim();
        city = st.nextToken().trim();
        street = st.nextToken().trim();
        house = st.nextToken().trim();
        building = st.nextToken().trim();
        flat = st.nextToken().trim();
    }

    public String toString() {
        return "Страна: " + country + ", регион: " + region + ", город: " + city
                + ", улица: " + street + ", дом: " + house + ", корпус: " + building
                + ", квартира: " + flat;
    }
}
