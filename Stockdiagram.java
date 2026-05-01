import java.util.Scanner;

abstract class Asset {
    
    protected String descriptor;    
    protected String date;          
    protected double current_value; 

    
    Asset(String descriptor, String date, double current_value) {
        this.descriptor = descriptor;
        this.date = date;
        this.current_value = current_value;
    }

    
    abstract void displayDetails(); [span_1](start_span)
}


class Stock extends Asset {
    private int num_shares;      
    private double share_price;  
    private String asset;        

    Stock(String descriptor, String date, double current_value, int num_shares, double share_price, String asset) {
        super(descriptor, date, current_value);
        this.num_shares = num_shares;
        this.share_price = share_price;
        this.asset = asset;
    }

  
    [span_2](start_span)void displayDetails() { 
        System.out.println("--- Stock Asset Details ---");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + current_value);
        System.out.println("Shares: " + num_shares);
        System.out.println("Share Price: " + share_price);
        System.out.println("Asset Type: " + asset);
    }
}


class Bond extends Asset {
    private double interest_rate; 
    private String asset;         

    Bond(String descriptor, String date, double current_value, double interest_rate, String asset) {
        super(descriptor, date, current_value);
        this.interest_rate = interest_rate;
        this.asset = asset;
    }

    
    [span_3](start_span)void displayDetails() { //[span_3](end_span)
        System.out.println("\n--- Bond Asset Details ---");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Interest Rate: " + interest_rate + "%");
        System.out.println("Asset Type: " + asset);
    }
}


class Savings extends Asset {
    private double interest_rate; 
    private String asset;         

    Savings(String descriptor, String date, double current_value, double interest_rate, String asset) {
        super(descriptor, date, current_value);
        this.interest_rate = interest_rate;
        this.asset = asset;
    }

    
    [span_4](start_span)void displayDetails() { 
        System.out.println("\n--- Savings Asset Details ---");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Interest Rate: " + interest_rate + "%");
        System.out.println("Total Value: " + current_value);
    }
}

public class AssetTest {
    public static void main(String[] args) {
      
        Asset stockObj = new Stock("Tech Equity", "2023-10-25", 5000.0, 50, 100.0, "Common Stock");
        Asset bondObj = new Bond("Gov Treasury", "2024-01-01", 10000.0, 4.5, "Fixed Income");
        Asset savingsObj = new Savings("Personal Savings", "2023-05-12", 1500.0, 2.1, "Cash");

        
        stockObj.displayDetails();
        bondObj.displayDetails();
        savingsObj.displayDetails();
    }
                                   }
