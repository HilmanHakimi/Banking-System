package Day6;

import java.util.Arrays;

//Employee class represents a generic employee with name and salary
class Employee{
    private String name;
    private double salary;

    //constructor to initialize name and salary
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    //Getter and setter methods for name
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    //Getter and setter method for salary
    public double getSalary(){
        return salary;
    }

    public void setSalary (double salary) {
        this.salary = salary;
    }
}

//Astraunot class extends employee and adds an agency attribute
class Astronaut extends Employee{
    private String agency;

    //constructor to initialie name salary and agency
    public Astronaut(String name, double salary, String agency){
        super(name,salary);//call the superclass
        this.agency = agency;
    }
    public String  getAgency(){
        return agency;
    }

    public void setAgency(String agency){
        this.agency = agency;
    }



}

//doctor class extends employee and adds a specialization attribute
class Doctor extends Employee{
    private String specialization;

    //constructor to initialized name salary and specialization
    public Doctor (String name, double salary, String specialization){
        super(name,salary); //call the super class constructor
        this.specialization = specialization;
    }

    //getter and setter methods for specialization
    public String getSpecialization(){
        return specialization;
    }
    public void setSpecialization(String specialization){
        this.specialization = specialization;

    }
}

//programmer class extends employee and adds language attribute
class Programmer extends Employee{
    private String[] language;

    //constructor to initialized name, salary and languages
    public Programmer(String name, double salary, String[] language){
        super(name, salary);
        this.language = language;
    }

    //getter an setter method for language
    public String[] getLanguage(){
        return language;
    }

    public void setLanguage(){
        this.language=language;
    }
}

//manager class extends employee and adds a department attribute
class Manager extends Employee{
    private String department;

    //constructor name, salary and department
    public Manager(String name, double salary, String department){
        super(name , salary);//call superclass constructor
        this.department = department;
    }

    //getter and setter methods for department
    public String getDepartment(){
        return department;
    }

    public void setDepartment(){
        this.department = department;
    }
}





public class InheritanceDemo {
    public static void main(String[] args) {
        //create instances for each subclass
        Astronaut astronaut = new Astronaut("John Doe",60000, "NASA");
        Doctor doctor = new Doctor("Arieq Huwaidi", 40000, "Orthopedics");
        Programmer programmer = new Programmer("Hilman Hakimi", 100000, new String[]{"Java", "Python", "C++", "RUST"});
        Manager manager = new Manager("Ben Johnson", 90000, "Engineering");


        //Print Information about each employee
        System.out.println("Employee Details: ");
        System.out.println("1. "+ astronaut.getName()+"       RM"+astronaut.getSalary()+"   Agency: "+astronaut.getAgency());
        System.out.println("2. "+doctor.getName()+"  RM"+doctor.getSalary()+"   Specialization:"+doctor.getSpecialization());
        System.out.println("3. "+programmer.getName()+"  RM"+programmer.getSalary()+"  Languages:"+ String.join(",", programmer.getLanguage()));
        System.out.println("4. "+manager.getName()+"    RM"+manager.getSalary()+"   Department:"+manager.getDepartment());
    }
}
