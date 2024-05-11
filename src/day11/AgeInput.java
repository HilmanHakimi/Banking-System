package day11;
 import java.util.InputMismatchException;
import java.util.Scanner;
public class AgeInput {
    public static void main(String[] args) {
        //create a scanner object to read user input
        Scanner sc = new Scanner(System.in);

        int age;

        //loop until a valid age is entered
        while(true){
            try{
                //prompt the user to input the age
                System.out.println("Enter your age: ");
                //read the integer inut from user
                age =sc.nextInt();
                //check if the age is positive or not
                if(age > 0){
                    //exit the loop if age is valid
                    break;
                }else{
                    //inform the user about invalid input and ask to try again
                    System.out.println("Age must be positive. Please try again");
                }
            }catch(InputMismatchException e){
                //handle cases where the user enters something other than number
                System.out.println("Invalid input please enter a valid number!");
                //clear the scanner buffer to avoid issues in the next iteration
                sc.nextLine();

            }
        }
        //print valid age entered by the user
        System.out.println("You entered: "+age);
    }
}
