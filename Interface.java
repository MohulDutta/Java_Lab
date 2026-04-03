interface SalesDepartment {
    void processSale(double amount);
}

interface FinanceDepartment {
    void generateInvoice(String clientName, double amount);
}

class CommercialExecutive implements SalesDepartment, FinanceDepartment {

    public void processSale(double amount) {
        System.out.println("Sale processed: " + amount);
    }

    public void generateInvoice(String clientName, double amount) {
        System.out.println("Invoice Generated");
        System.out.println("Client: " + clientName);
        System.out.println("Amount: " + amount);
    }

    void showSummary() {
        System.out.println("Commercial operations completed successfully");
    }
}

public class Main3 {
    public static void main(String[] args) {

        CommercialExecutive obj = new CommercialExecutive();

        obj.processSale(15000);
        obj.generateInvoice("ABC Ltd", 15000);
        obj.showSummary();
    }
}
