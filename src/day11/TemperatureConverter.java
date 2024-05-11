package day11;

import java.util.Scanner;

class Converter{
    private int temperature; //Temperature variable

    //Constructor to iniltialize temperature
    public Converter (int temperature){
        this.temperature = temperature;//Initialize temperature
    }

    //Method to convert temperature
    public double convertTemperature(String unit) throws IllegalArgumentException {
        switch (unit.toUpperCase()) {
            case "C":
                return (temperature * 9.0 / 5.0) + 32; // Celsius to Fahrenheit
            case "F":
                return (temperature - 32) * 5.0 / 9.0; // Fahrenheit to Celsius
            default:
                throw new IllegalArgumentException("Invalid unit. Please enter 'C' for Celsius or 'F' for Fahrenheit.\n"); // Throw exception for invalid unit
        }
    }


}


public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true){
            try{
                System.out.print("Enter temperature : ");
                int temp = Integer.parseInt(sc.nextLine());
                System.out.print("Enter unit (C/F): "); // Prompt user for unit
                String unit = sc.nextLine(); // Read unit input
                Converter converter = new Converter(temp); // Create Converter object with initial temperature
                double convertedTemp = converter.convertTemperature(unit); // Convert temperature
                // Print converted temperature with unit
                if(unit.equals("C")){
                    System.out.println(temp + " " + "Celcius" + " is equal to " + convertedTemp + " " + (unit.toUpperCase().equals("C") ? "Fahrenheit" : "Celsius"));

                } else if (unit.equals("F")) {
                    System.out.println(temp + " " + "Fahrenheit" + " is equal to " + convertedTemp + " " + (unit.toUpperCase().equals("C") ? "Fahrenheit" : "Celsius"));

                }
                break;
            }catch(NumberFormatException e){
                System.out.print("Invalid input. Please enter number. \n\n");

            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());

            }

        }
        sc.close();
    }
}
