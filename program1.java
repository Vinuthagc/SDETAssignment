Account.java
class Account {
    protected double balance;
    protected double interestRate;

    public Account(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest Added: " + interest);
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

SavingsAccount.java
class SavingsAccount extends Account {
    public SavingsAccount(double balance, double interestRate) {
        super(balance, interestRate);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Savings Account Interest Calculation:");
        super.calculateInterest();
    }
}


CurrentAccount.java
class CurrentAccount extends Account {
    public CurrentAccount(double balance, double interestRate) {
        super(balance, interestRate);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Current Account Interest Calculation:");
        super.calculateInterest();
    }
}

Main.java
public class Main {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(10000, 5);
        sa.calculateInterest();
        sa.displayBalance();

        CurrentAccount ca = new CurrentAccount(20000, 3);
        ca.calculateInterest();
        ca.displayBalance();
    }
}






