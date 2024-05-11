package ReviewExercise;

import java.util.Scanner;

public class Bank2 {
    // private fields for account and balance
    private final String accountNumber;
    private double balance;

    // constructor to initialize account number and balance
    public Bank2(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // getter method for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // getter method for balance
    public double getBalance() {
        return balance;
    }

    // method to deposit money into bank
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $:" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // method to withdraw money from the bank
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // create a new bank account object
        Bank2 account = new Bank2("123456789", 1000);

        boolean exit = false;

        while (!exit) {
            // display menu options
            System.out.println("\nWelcome to the To-Do List App!");
            System.out.println("\nCommands:");
            System.out.println("1. Add a task");
            System.out.println("2. Mark a task as completed");
            System.out.println("3. List all tasks");
            System.out.println("4. Delete a task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            // read user choice
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: $" + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter the amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
                    break;
            }
        }

        scanner.close();
    }
}



