public class Employee extends Person {
    private String jobTitle;
    private double salary;

    public Employee(String name, int birthYear, String address, String jobTitle, double salary) {
        super(name, birthYear, address);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nJob Title: " + jobTitle + "\nSalary: " + salary;
    }
}
