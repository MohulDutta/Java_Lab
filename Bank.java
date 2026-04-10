import java.util.*;

interface Bank {
    void bankDetails();
}

class Customer {
    String name;
    int custId;

    void getCustomer(Scanner sc) {
        name = sc.next();
        custId = sc.nextInt();
    }

    void printCustomer() {
        System.out.println(name + " " + custId);
    }
}

class Account extends Customer implements Bank {
    int accNo;
    double balance;

    void getAccount(Scanner sc) {
        getCustomer(sc);
        accNo = sc.nextInt();
        balance = sc.nextDouble();
    }

    void printAccount() {
        printCustomer();
        bankDetails();
        System.out.println(accNo + " " + balance);
    }

    public void bankDetails() {
        System.out.println("ABC Bank");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account a = new Account();

        a.getAccount(sc);
        a.printAccount();
    }
}
