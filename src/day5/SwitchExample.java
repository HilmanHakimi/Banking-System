package day5;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first num: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter second num: ");
        double num2 = sc.nextDouble();
        System.out.println("Enter operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);
        double result;

        switch (operator){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 + num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        System.out.println("Result: "+result);


    }
}
