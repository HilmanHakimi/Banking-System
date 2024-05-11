package Day3;

public class BankAccount {
    //private fields for account and balance
    private final String accountNumber;
    private double balance;

    //constructor to initialize account number and balance
    public BankAccount(String accountNumber, double initialBalance){
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    //getter method for account number
    public String getAccountNumber(){

        return accountNumber;
    }

    //getter methods for balance
    public double getBalance(){
        return balance;
    }

    //method to deposit money into bank
    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $:"+ amount);
        }
        else{
            System.out.println("Invalid deposit number");
        }
    }

    //Method to deposit the money into account
    public void withdraw (double amount){
        if(amount > 0 && amount <= balance){
            balance -=amount;
            System.out.println("withdraw : RM" + amount);
        }
        else{
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }

    public static void main(String[] args) {
     //create a new bankaccount object with account number "123456789" and initial balance is $1000"
     BankAccount account = new BankAccount("123456789", 1000);

     //display the account number and intial balance
        System.out.println("Account number :  " + account.getAccountNumber());
        System.out.println("Initial balance  :"+ account.getBalance());

        //dedposit $500 into the account
        account.deposit(500);
        System.out.println("Balance aftar the deposit : $" + account.getBalance());

        //Withdraw 200 from account
        account.withdraw(200);
        System.out.println("balnce after withdarawal : " + account.getBalance());

        //attempt to withdraw $2000 (more than the balance) from the account
        account.withdraw(2000);
    }
}
