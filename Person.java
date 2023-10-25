public class Person {
    private String name;
    private int birthYear;
    private String address;

    public Person(String name, int birthYear, String address) {
        this.name = name;
        this.birthYear = birthYear;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nBirth Year: " + birthYear + "\nAddress: " + address;
    }
}