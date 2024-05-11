package day5;

import java.util.Scanner;


public class DoWhileExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        do{
            System.out.println("Enter a positive number: ");
            number = sc.nextInt();
        }while(number <= 0);{
            System.out.println("You entered: "+ number);
            sc.close();}



    }
}
