public class Main {
    public static void main(String[] args) {
        // Creating a new account with id number and balance
        Account account = new Account(1122, 20_000);
        // Setting the AnnualInterestRate to 4.5%
        account.setAnnualInterestRate(4.5);
        // Withdraw $2,500.00 from the account
        account.withdraw(2_500.0);
        // Deposit $3,000.00 to the new account
        account.deposit(3_000.0);

        //Displaying the current balance, the monthlyInterestRate, and when the account was created
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Monthly Interest Rate: " + account.getMonthlyInterest());
        System.out.println("The Account was created in: " + account.getDateCreated());

    }
}

// Creating class account with id, balance, annualInterestRate, and dateCreated
class Account {
    private int id = 0;
    private double balance = 0.0;
    private static double annualInterestRate = 0.0;
    private final java.util.Date dateCreated;

    public Account() {
        dateCreated = new java.util.Date();
    }

    public Account(int id, double balance) {
        this();
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public String getDateCreated() {
        return this.dateCreated.toString();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12 ;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
}




