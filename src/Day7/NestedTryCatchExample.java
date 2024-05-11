package Day7;

import java.util.Scanner;

public class NestedTryCatchExample {
    public static void main(String[] args) {
        //create a scanner object to read user input
        Scanner sc = new Scanner(System.in);

        //Ask the user to enter number of elements
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int [] numbers = new int[n]; //create an array to store number

        //ask the user to input the elements and store in a array
        System.out.println("Enter the elements");
        for (int i=0; i<n; i++){
            numbers[i] = sc.nextInt();
        }
        //close the scanner object
        sc.close();

        //try to block iterate through the array and perform decision
        try{
            for (int number : numbers){
             try{
                  int result = 10/number;
                    System.out.println("Result : "+result);
        }catch (ArithmeticException e){
            System.out.println("division by zero");
    }
            }
        }catch(ArithmeticException e){
            System.out.println("Error: Array index out of bounds");
        }


    }
}
