import java.util.Scanner;

class Employee {
    int empid, salary;
    String name, address;

    Employee(int empid, int salary, String name, String address) {
        this.empid = empid;
        this.salary = salary;
        this.name = name;
        this.address = address;
    }
}

class Teacher extends Employee {
    String department, subject;

    Teacher(int empid, int salary, String name, String address, String department, String subject) {
        super(empid, salary, name, address);
        this.department = department;
        this.subject = subject;
    }

    void display() {
        System.out.println("\nEmployee ID: " + empid);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Subject: " + subject);
        System.out.println("----------------------------------------------------");
    }
}

public class EmployeeSuper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        Teacher[] teachers = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for employee " + (i + 1) + ":");

            System.out.print("Enter the employee ID: ");
            int empid = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter the employee name: ");
            String name = sc.nextLine();

            System.out.print("Enter salary: ");
            int salary = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter the employee address: ");
            String address = sc.nextLine();

            System.out.print("Enter the department: ");
            String department = sc.nextLine();

            System.out.print("Enter the subject: ");
            String subject = sc.nextLine();

            teachers[i] = new Teacher(empid, salary, name, address, department, subject);
        }

        System.out.println("\nDetails of teachers:");
        System.out.println("----------------------------------------------------");

        for (Teacher teacher : teachers) {
            teacher.display();
        }

        sc.close();
    }
}
