/*
Task 4: Inheritance — Employee Management (20 Marks)

Create a parent class named "Employee".

Add common properties such as:

- Name
- Employee ID
- Salary

Create two child classes:

- "Developer"
- "Manager"

Add at least one additional property or method specific to each child class.

Create objects of both child classes and display their details.

Requirements:

- Demonstrate "extends".
- Demonstrate code reusability through inheritance.
- Use parent and child class methods/properties.

*/
class Employee {

    
    String name;
    int employeeId;
    double salary;

    
    Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    
}

// Child class Developer
class Developer extends Employee {

    String programmingLanguage;

    Developer(String name, int employeeId, double salary,
              String programmingLanguage) {

        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Developer-specific method
    void writeCode() {
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Developer is writing code.");
    }

    
}

// Child class Manager
class Manager extends Employee {

    int teamSize;

    Manager(String name, int employeeId, double salary, int teamSize) {
        super(name, employeeId, salary);
        this.teamSize = teamSize;
    }

    // Manager-specific method
    void manageTeam() {
        System.out.println("Team Size: " + teamSize);
        System.out.println("Manager is managing the team.");
    }

    
}

public class week3_task04 {

    public static void main(String[] args) {

        // Developer object
        Developer developer = new Developer("Divankar", 101, 60000, "Java");

        // Manager object
        Manager manager = new Manager("Rahul", 102, 90000, 8);

        System.out.println("Name: " + developer.name);
        System.out.println("Employee ID: " + developer.employeeId);
        System.out.println("Salary: " + developer.salary);

        System.out.println("Name: " + manager.name);
        System.out.println("Employee ID: " + manager.employeeId);
        System.out.println("Salary: " + manager.salary);

        developer.writeCode();
        manager.manageTeam();

        
    }
}

/*

OUTPUT

Name: Divankar
Employee ID: 101
Salary: 60000.0
Name: Rahul
Employee ID: 102
Salary: 90000.0
Programming Language: Java
Developer is writing code.
Team Size: 8
Manager is managing the team.
*/