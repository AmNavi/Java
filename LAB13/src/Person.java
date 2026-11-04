public class Person {
    private String lastName;
    private String firstName;
    private String middleName;

    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    // возвращает Фамилия И.О., имя и отчество могут отсутствовать
    public String getShortName() {
        // StringBuilder быстрее, чем склеивание через +
        StringBuilder sb = new StringBuilder(lastName);
        boolean hasFirst = firstName != null && !firstName.isEmpty();
        boolean hasMiddle = middleName != null && !middleName.isEmpty();

        if (hasFirst || hasMiddle) {
            sb.append(' ');
        }
        if (hasFirst) {
            sb.append(firstName.charAt(0)).append('.');
        }
        if (hasMiddle) {
            sb.append(middleName.charAt(0)).append('.');
        }
        return sb.toString();
    }
}