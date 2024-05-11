package Day7;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit =false;


        while (!exit) {
            double num1, num2;
            try {
                System.out.println("Enter your first num: ");
                num1 = sc.nextDouble();
                System.out.println("Enter your second num: ");
                num2 = sc.nextDouble();

            } catch (InputMismatchException e) {
                System.out.println("Invalid input for numbers. Please enter valid numbers.");
                sc.next(); // Clear the invalid input
                continue; // Prompt again for input
            }

            System.out.println("Enter operator (+, -, *, /, %): ");
            String operatorInput = sc.next();
            if (operatorInput.equalsIgnoreCase("exit")) {
                exit = true;
                continue;
            }


            double result;
            char operator = operatorInput.charAt(0);

            switch (operator) {
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
                    try {
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            throw new ArithmeticException("Division by zero is not allowed");
                        }
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                        continue; // Prompt again for input
                    }
                    break;
                case '%':
                    result = num1 % num2;
                    break;
                case 'q':
                    System.out.println("Exiting the calculator...");
                    sc.close();
                    return; // Exit the program
                default:
                    System.out.println("Invalid operator");
                    continue; // Prompt again for input
            }

            System.out.println("Result: " + result);
            System.out.println("\n");
            System.out.println("If you wish to exit type exit for operator input.");
        }
    }
}


