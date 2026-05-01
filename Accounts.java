
abstract class Accounts {
    protected double balance;
    protected String accountNumber;
    protected String accountHoldersName;
    protected String address;

  
    public Accounts(String accountNumber, String accountHoldersName, String address, double balance) {
        this.accountNumber = accountNumber;
        this.accountHoldersName = accountHoldersName;
        this.address = address;
        this.balance = balance;
    }

    
    public abstract void withdrawl(double amount);
    public abstract void deposit(double amount);

    
    public void display() {
      
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHoldersName);
        System.out.println("Address        : " + address);
        System.out.println("Current Balance: $" + balance);
      
    }
}


class SavingsAccount extends Accounts {
    private double rateOfInterest;

    
    public SavingsAccount(String accountNumber, String accountHoldersName, String address, double balance, double rateOfInterest) {
        super(accountNumber, accountHoldersName, address, balance);
        this.rateOfInterest = rateOfInterest;
    }

    /l
    
    public void withdrawl(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn: $" + amount);
        } else {
            System.out.println("Withdrawal failed: Insufficient balance or invalid amount.");
        }
    }

    
  
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Deposit failed: Invalid amount.");
        }
    }

    
    public void calculateAmount() {
        double interest = (balance * rateOfInterest) / 100;
        balance += interest;
        System.out.println("Interest of $" + interest + " applied at a rate of " + rateOfInterest + "%.");
    }
}


public class Main {
    public static void main(String[] args) {
    
        SavingsAccount sa = new SavingsAccount("SAV-9988", "Jane Smith", "456 Oak Avenue", 5000.0, 4.5);

        
        sa.display();

    
        sa.deposit(1500.0);
        sa.withdrawl(500.0);

        
        sa.calculateAmount();

    
        sa.display();
    }
                               }
