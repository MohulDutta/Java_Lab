interface Bank {
    void deposit(double amt);
    void withdraw(double amt);
}

class Customer {
    String name;

    void getCustomer(String n) {
        name = n;
    }
}

class Account extends Customer implements Bank {

    double balance;

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        balance -= amt;
    }

    void display() {
        System.out.println("Customer Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class Main2 {
    public static void main(String[] args) {

        Account a = new Account();

        a.getCustomer("Mahul");
        a.deposit(5000);
        a.withdraw(1000);

        a.display();
    }
}
