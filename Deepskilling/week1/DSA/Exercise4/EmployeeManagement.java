package Deepskilling.week1.DSA.Exercise4;

class Employee {

    int employeeId;
    String name;
    String position;
    double salary;

    Employee(int employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String toString() {
        return employeeId + " " + name + " " + position + " " + salary;
    }
}


public class EmployeeManagement {

    Employee[] employees = new Employee[5];
    int count = 0;

    // Add
    void addEmployee(Employee emp) {
        employees[count++] = emp;
    }

    // Search
    Employee searchEmployee(int id) {

        for (int i = 0; i < count; i++) {

            if (employees[i].employeeId == id)
                return employees[i];
        }

        return null;
    }

    // Traverse
    void displayEmployees() {

        for (int i = 0; i < count; i++)
            System.out.println(employees[i]);
    }

    // Delete
    void deleteEmployee(int id) {

        int index = -1;

        for (int i = 0; i < count; i++) {

            if (employees[i].employeeId == id) {
                index = i;
                break;
            }
        }

        if (index != -1) {

            for (int i = index; i < count - 1; i++)
                employees[i] = employees[i + 1];

            count--;
        }
    }

    public static void main(String[] args) {

        EmployeeManagement em = new EmployeeManagement();

        em.addEmployee(new Employee(101, "Rahul", "Manager", 70000));
        em.addEmployee(new Employee(102, "Priya", "Developer", 50000));
        em.addEmployee(new Employee(103, "Aman", "Tester", 40000));

        System.out.println("Employees:");
        em.displayEmployees();

        System.out.println("\nSearching Employee 102:");
        System.out.println(em.searchEmployee(102));

        em.deleteEmployee(102);

        System.out.println("\nAfter Deletion:");
        em.displayEmployees();
    }
}
