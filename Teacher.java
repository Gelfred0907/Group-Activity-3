public class Teacher extends Person {
    private String subject;

    public Teacher(String name, int birthYear, String address, String subject) {
        super(name, birthYear, address);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSubject: " + subject;
    }
}