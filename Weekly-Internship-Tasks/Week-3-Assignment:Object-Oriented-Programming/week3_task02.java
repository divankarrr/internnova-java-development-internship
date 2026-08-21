/*
Task 2: Constructors — Employee Information (15 Marks)

Create an "Employee" class with:

- Employee ID
- Employee Name
- Department
- Salary

Implement:

- A default constructor
- A parameterized constructor

Create objects using both constructors and display their information.
*/


class Employee {

    int Id;
    String Name;
    String department;
    double salary;

    // A default constructor
    Employee() {
        Id = 0;
        Name = "Unknown";
        department = "Not Assigned";
        salary = 0.0;
    }

    // A parameterized constructor
    Employee(int Id, String Name, String department, double salary) {
        this.Id = Id;
        this.Name = Name;
        this.department = department;
        this.salary = salary;
    }

    
}

public class week3_task02 {
    public static void main(String[] args) {

        // Object using Default Constructor
        Employee emp1 = new Employee();

        // Object using Parameterized Constructor
        Employee emp2 = new Employee(101,"Divankar","CSE",5000000);

        // Display information
        System.out.println("Default values of employee");
        System.out.println("Employee ID: " + emp1.Id);
        System.out.println("Employee Name: " + emp1.Name);
        System.out.println("Department: " + emp1.department);
        System.out.println("Salary: " + emp1.salary);

        System.out.println("Parameterized values of employee");
        System.out.println("Employee ID: " + emp2.Id);
        System.out.println("Employee Name: " + emp2.Name);
        System.out.println("Department: " + emp2.department);
        System.out.println("Salary: " + emp2.salary);

        
    }
}

/*

Default values of employee
Employee ID: 0
Employee Name: Unknown
Department: Not Assigned
Salary: 0.0
Parameterized values of employee
Employee ID: 101
Employee Name: Divankar
Department: CSE
Salary: 5000000.0
*/