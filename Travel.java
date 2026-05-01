import java.util.Scanner;


abstract class AbstractProduct {
    protected int product_id; 
    protected String name; 
    protected String description; 

    abstract void display();
}

class Product extends AbstractProduct {
    protected double price; 

    
    void display() {
        System.out.println("Product ID: " + product_id);
        System.out.println("Price: " + price);
    }
}

class Book extends Product {
    protected String isbn; 
    protected String author; 
    protected String title; 
}

class TravelGuide extends Book {
    private String country; 

    TravelGuide(int id, String name, String desc, double price, String isbn, String author, String title, String country) {
        this.product_id = id; 
        this.name = name;
        this.description = desc;
        this.price = price;
        this.isbn = isbn;
        this.author = author;
        this.title = title;
        this.country = country; 
    }

    
    void display() {
        System.out.println("--- Travel Guide Details ---");
        System.out.println("Product ID: " + product_id);
        System.out.println("Title: " + title);
        System.out.println("Country: " + country);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class CompactDisc extends Product {
    private String artist; 
    private String title; 

    CompactDisc(int id, String name, String desc, double price, String artist, String title) {
        this.product_id = id; 
        this.name = name;
        this.description = desc;
        this.price = price;
        this.artist = artist; 
        this.title = title; 
    }

    
    void display() {
        System.out.println("\n--- Compact Disc Details ---");
        System.out.println("Product ID: " + product_id);
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        [span_1](start_span)
        TravelGuide tg = new TravelGuide(101, "Globe Trotter", "Euro Trip Guide", 29.99, "978-3-16", "John Doe", "Europe 2026", "France");
        CompactDisc cd = new CompactDisc(505, "Music Album", "Classical Hits", 15.50, "Mozart", "Symphony 40");

        tg.display();
        cd.display();
    }
}
