package day11;


//interface for al employee
interface Employee{
    double calculateSalary(); //method to calculate monthly salary
}
//teacher class implementing the employee interface
class Teacher implements Employee{
    private final double teachingHours; // number of teaching hours per week
    private final  double hourlyRate; //hourly rate for teachers

    public Teacher(double teachingHours, double hourlyRate){
        this.teachingHours = teachingHours;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary(){
        return teachingHours * hourlyRate; //calculate salary based on hours
    }
}
//administrative staff class implementing the employee interface
class AdministrativeStaff implements Employee {
    private final double fixedSalary; //fixed monthly salary for administrative staff

    public AdministrativeStaff(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculateSalary() {
        return fixedSalary;//return the fixed monthly salary
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        //example usage
        Employee teacher = new Teacher(40, 25);
        Employee adminStaff = new AdministrativeStaff(3000);

        //calculate and display the monthly salary for each employee
        System.out.println("\nTeacher salary is: RM"+teacher.calculateSalary());
        System.out.println("Salary for admin staff is: RM"+adminStaff.calculateSalary());
    }
}
