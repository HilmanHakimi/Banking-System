package day10;

import java.util.ArrayList;


interface Employee{

    void displayDetails();
    double getSalary();

}
class Manager implements Employee{
    private String name;
    private String ID;
    protected double salary;
    private String department;

    public Manager (String name, String ID, double salary, String department){
        this.name = name;
        this.ID = ID;
        this.salary = salary;
        this.department = department;
    }

    public void displayDetails(){
        System.out.println("Employee: "+ name);
        System.out.println("ID: "+ID);
        System.out.println("Salary: "+salary);
        System.out.println("Department: "+department);
    }

    public double getSalary(){
        return salary;
    }
}
class Developer implements Employee{
    private String name;
    private String ID;
    protected double salary;
    private String language;

    public Developer (String name, String ID, double salary, String language){
        this.name = name;
        this.ID = ID;
        this.salary = salary;
        this.language = language;
    }
    public void displayDetails(){
        System.out.println("Employee: "+ name);
        System.out.println("ID: "+ID);
        System.out.println("Salary: "+salary);
        System.out.println("Department: "+language);
    }

    public double getSalary(){
        return salary;
    }


}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create an ArrayList of Employee objects
        ArrayList<Employee> employees = new ArrayList<>();

        // Populate the ArrayList with Manager and Developer objects
        employees.add(new Manager("Danish", "F01", 60000, "Finance"));
        employees.add(new Developer("Irfan", "J01", 70000, "Java"));
        employees.add(new Manager("Yaana", "H02", 65000, "HR"));
        employees.add(new Developer("Maisa", "P02", 75000, "Python"));

        // Iterate over the ArrayList and call displayDetails() method for each employee
        for (int i = 0; i < employees.size(); i++) {
            Employee emp = employees.get(i);
            emp.displayDetails();
            System.out.println(); // Add a blank line for readability
        }

        // Calculate and display the total salary of all employees
        double totalSalary = 0;
        for (int i = 0; i < employees.size(); i++) {
            Employee emp = employees.get(i);
            totalSalary += emp.getSalary();
        }
        System.out.println("Total Salary of all employees: $" + totalSalary);

    }
}
