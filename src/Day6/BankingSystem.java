package Day6;

import java.util.zip.CheckedInputStream;//Account Class
class Account{
    protected int accountNumber;
    protected double balance;

    //constructor to initilaize the account number and  balance
    public Account (int accountNumber){
        this.accountNumber= accountNumber;
        this.balance = 0.0;
    }

    //method to deposit money into the account
    public void deposit(double amount){
        balance +=amount; //add amount to balance
    }

    //method to withdraw money
    public void withdraw(double amount){
        if(balance >= amount){
            balance -=amount; //substract the amount form balance if sufficients fund are  available

        }else{
            System.out.println("Insufficient balance");
        }
    }
    //method to get the current balance of the account
    public double getBalance() {
        return balance;

    }
}

//savings account class
class SavingsAccount extends Account{
    private final double interestRate;

    //constructor to initialized account num, interest rate and call
    public SavingsAccount(int accountNumber, double interestRate) {
      super(accountNumber);
       this.interestRate = interestRate;
    }
    //method to add the savings account balance
    public  void addInterest (){
     double interest = balance * interestRate/100;//calculate
        deposit(interest);
    }
}



//CheckingAccount
class CheckingAccount extends Account{
    private final double overdraftLimit;// overdraft limit for the checking account

    //constructor to initialize account number, overdraft limit and call superclass constructor
    public CheckingAccount(int accountNumber, double overdraftLimit) {
        super(accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    //override withdraw method to include overdraft limit
    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;

        } else {
            System.out.println("Exceeded over draft limit. ");
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(101, 2.5);
        CheckingAccount checkingAccount = new CheckingAccount(201,500);

        //deposit money into savings account and print balancec
        savingsAccount.deposit(1000);
        System.out.println("Saving account balance: "+savingsAccount.getBalance());

        //withdraw money
        savingsAccount.withdraw(300);
        System.out.println("Savings account balance :" + savingsAccount.getBalance());

        //add interest
        savingsAccount.addInterest();
        System.out.println("Saving account balance for interest: "+savingsAccount.getBalance());

        //depo money into checking account and print balance
        checkingAccount.deposit(1500);

        //withdraw money from checking account and print balance
        checkingAccount.deposit(1500);
        checkingAccount.withdraw(1000);
        System.out.println("Checking amount balance: "+savingsAccount.getBalance());

    }
}

