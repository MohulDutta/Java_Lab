abstract class Motorvehicle {
    String modeln;
    String modelno;
    double modelpr;
    Motorvehicle (String name, String number, double price)
    {
        modeln = name;
        modelno = number;
        modelpr = price;
    }
    abstract void display();
}
class Car extends Motorvehicle{
    double discount;
    Car(String name, String number, double price, double discount){
        super(name, number, price);
        this.discount = discount;
    }
    double discount(){
        return modelpr * discount / 100;
    }
    void display(){ 
        System.out.println("car name: " +modeln);
        System.out.println("model number: "+modelno);
        System.out.println("price: "+modelpr);
        System.out.println("discount rate: "+discount);
        System.out.println("final price: "+ (modelpr - discount()));
    }
}
public class Motor{
    public static void main(String[] args){
        Car c = new Car ("Honda City", "HC123", 100000000,10);
        c.display();
    }
}
