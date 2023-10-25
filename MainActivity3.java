                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  import java.util.Scanner;

public class MainActivity3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons, students, teachers, and employees you want to add: ");
        int numberOfEntities = scanner.nextInt();

        Person[] entities = new Person[numberOfEntities];

        for (int i = 0; i < numberOfEntities; i++) {
            scanner.nextLine();

            System.out.print("Enter the name of Person " + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.print("Enter the birth year of Person " + (i + 1) + ": ");
            int birthYear = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter the address of Person" + (i + 1) + ": ");
            String address = scanner.nextLine();

            System.out.print(
                    "Is this Person a student, a teacher, an employee, or just a person? (student, teacher, employee, or person): ");
            String entityType = scanner.nextLine();

            if ("student".equalsIgnoreCase(entityType)) {
                System.out.print("Enter the student ID: ");
                int studentId = scanner.nextInt();
                entities[i] = new Student(name, birthYear, address, studentId);
            } else if ("teacher".equalsIgnoreCase(entityType)) {
                System.out.print("Enter the subject taught: ");
                String subject = scanner.nextLine();
                entities[i] = new Teacher(name, birthYear, address, subject);
            } else if ("employee".equalsIgnoreCase(entityType)) {
                System.out.print("Enter the job title: ");
                String jobTitle = scanner.nextLine();
                System.out.print("Enter the salary: ");
                double salary = scanner.nextDouble();
                entities[i] = new Employee(name, birthYear, address, jobTitle, salary);
            } else {
                entities[i] = new Person(name, birthYear, address);
            }
        }

        System.out.println("\nEntities:");

        for (int i = 0; i < numberOfEntities; i++) {
            System.out.println("Entity " + (i + 1) + ":");
            System.out.println(entities[i].toString());

            if (entities[i] instanceof Student) {
                System.out.println("Student ID: " + ((Student) entities[i]).getStudentId());
            } else if (entities[i] instanceof Teacher) {
                System.out.println("Subject: " + ((Teacher) entities[i]).getSubject());
            } else if (entities[i] instanceof Employee) {
                System.out.println("Job Title: " + ((Employee) entities[i]).getJobTitle());
                System.out.println("Salary: " + ((Employee) entities[i]).getSalary());
            }
        }

        scanner.close();
    }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      