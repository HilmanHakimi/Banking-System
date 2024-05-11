package day10;

class BankAccount {
    private int accountNumber;
    private double balance;
    private String ownerName;


    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    // Constructor
    public BankAccount(int accountNumber, double balance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        System.out.println();
        if (amount > 0) {
            balance += amount;// Add amount to balance
            System.out.println("Deposited amount: RM" + amount);
            System.out.println("Current balance: RM" + balance);
        } else {
            System.out.println("Invalid deposit number. Try again!");

        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        System.out.println();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw amount: RM" + amount);
            System.out.println("Current balance: RM" + balance);

        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println();
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Owner Name: " + ownerName);
        System.out.println();

    }
}



public class AccessModifierBankingSystem {
    public static void main(String[] args) {
         //Create two BankAccount objects
        BankAccount account1 = new BankAccount(12345, 1000.0, "Sam");
        BankAccount account2 = new BankAccount(67890, 500.0, "Antonio");
        System.out.println("Account 1 current balance: "+account1.getBalance());
        System.out.println("Account 2 current balance: "+account2.getBalance());

        account1.deposit(500);
        account1.getBalance();

        account2.deposit(500);
        account2.getBalance();

        account1.withdraw(200);
        account1.getBalance();

        account2.withdraw(200);
        account2.getBalance();

        account1.displayAccountDetails();
        account2.displayAccountDetails();

    }
}

