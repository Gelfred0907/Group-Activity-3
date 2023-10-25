public class Student extends Person {
    private int studentId;

    public Student(String name, int birthYear, String address, int studentId) {
        super(name, birthYear, address);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return super.toString() + "\nStudent ID: " + studentId;
    }
}