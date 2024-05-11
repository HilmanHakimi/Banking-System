package day5;

import java.util.Scanner;
import java.util.InputMismatchException;

public class SwitchExample2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double num1 = 0.0, num2 = 0.0;
        boolean validInput = false;

        while(!validInput){
            try{
                System.out.println("Enter first number : ");
                num1 = sc.nextDouble();
                System.out.println("Enter scond number : ");
                num2 = sc.nextDouble();
                validInput = true;
            }catch (InputMismatchException e){
                System.out.println("Invalid input. Please enter a valid value.");
                sc.nextLine(); //Clear the input buffer
            }


        }

        System.out.println("Enter operator (+,-,*,/,%)");
        char operator = sc.next().charAt(0);
        double result;

        switch (operator){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if(num2 != 0){
                    result=num1/num2;
                }else{
                    System.out.println("Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid number");
                return;
        }
        System.out.println("Result: "+result);

    }
}
