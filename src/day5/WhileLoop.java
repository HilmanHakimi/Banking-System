package day5;
import java.util.Random;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100)+1; //generate a number between 1 to 100
        Scanner sc = new Scanner(System.in);
        int guess;
        boolean guessCorrectly = false;

        System.out.println("Guess the number between 1 to 100");


        //loop until the correct number is guess
        while (!guessCorrectly){
            guess = sc.nextInt();

            //check if the guess is correct
            if(guess == numberToGuess){
                System.out.println("Congratulation you guess the correct number.");
                guessCorrectly = true; // this condition is going to exit the loop

            }else if(guess < numberToGuess) {
                System.out.println("Too low! try again");
            }
            else{
                System.out.println("Too high! try again");
            }
        }
        sc.close();//close the scanner
    }
}
