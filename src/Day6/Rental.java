package Day6;

import java.util.Scanner;


class Vehicle{
    private String make;
    private String model;
    private int year;
    private double rentalPricePerDay;

    //constructor
    public Vehicle(String make, String model,int year, double rentalPricePerDay){
        this.make = make;
        this.model = model;
        this.year = year;
        this. rentalPricePerDay = rentalPricePerDay;
    }

    //Getter and setter method for make
    public String getMake(){
        return make;
    }

    public void setMake(String make){
        this.make = make;
    }

    //getter and setter method for model
    public String getModel(){
        return model;
    }

    public void  setModel(String model){
        this.model = model;
    }

    //getter and setter method for year
    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year =year;
    }

    public double getRentalPricePerDay(){
        return rentalPricePerDay;
    }

    public void  setRentalPricePerDay(){
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public double calculateRentalCost (int days){
       return rentalPricePerDay * days;
    }
}

//class Car
class Car extends Vehicle{
    private int numSeats;
    private int numDoors;


    //constructor
    public Car(String make,String model, int year, double rentalPricePerDay,int numSeats,int numDoors){
        super(make,model,year,rentalPricePerDay);
        this.numSeats = numSeats;
        this.numDoors = numDoors;
    }}



class Motorcycle extends Vehicle{
    private int engineSize;

    //constructor
    public Motorcycle(String make,String model, int year, double rentalPricePerDay){
        super(make, model, year, rentalPricePerDay);
        this.engineSize = engineSize;

    }



}
public class Rental {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vehicletype;

        Car car = new Car("Mazda", "CX5", 2022, 150.0, 5, 4);
        Motorcycle motorcycle = new Motorcycle("Honda", "EX5", 2019, 40.0);

        System.out.println("Please enter number of day you want to rent: ");
        int days = sc.nextInt();

        double carRentalCost = car.calculateRentalCost(days);
        double motorRentalCost = motorcycle.calculateRentalCost(days);

        System.out.println("Enter type of vehicle (Car/Motorcycle)");

        System.out.println("The car rental price for: " + days + " days is RM " + carRentalCost);
        System.out.println("The motorcycle rent price for: " + days + "days is RM" + motorRentalCost);

        sc.close();


    }

}
