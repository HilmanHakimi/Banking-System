package day11;

import java.util.InputMismatchException;
import java.util.Scanner;

//This class represents a bank account with a balance and a method for withdrawing funds
class BankAccount{
    private double balance;


    //create a new bank account with specified initial balance
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }
    //withdraw the specified amount from the account balance
    public void withdraw(double amount) throws InsufficientFundsException{
        if(amount>balance){
            //throw a custom excepytion if balance is insufficient
            throw new   InsufficientFundsException("Insufficient funds for withdrawal");

        }
        balance -= amount;
        System.out.println("withdrawal succesful. new Balance: "+balance);
    }
}
//a custom exception class thrown when there are insufficient funds in the bank account
class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
        super(message);//call the superclass constructor to get the error message
    }
}

//This class will simulates on ATM that allow users to wiithdraw money from a bank account


public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(68000);

        while (true){
            try{
                System.out.println("enter the withdrawal amount: ");
                double withdrawalAmount = sc.nextDouble();

                //call withrdraw method with user input
                account.withdraw(withdrawalAmount);
                break;//exit loop on succesful withdrawal

            }catch (InputMismatchException e){
                System.out.println("Invalid Input please enter a number: ");
                sc.nextLine();//clear the input buffer

            }catch (InsufficientFundsException e){
                System.out.println("Error: "+e.getMessage());
            }
        }

    }
}
