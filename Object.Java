import java.util.Scanner;


abstract class ThreeDObject {
    abstract double wholeSurfaceArea(); [span_3](start_span)
    abstract double volume();           [span_4](start_span)
}

class Box extends ThreeDObject {
    double length, width, height;

    [span_5](start_span)
    Box(double l, double w, double h) {
        this.length = l;
        this.width = w;
        this.height = h;
    }

    
    double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    
    double volume() {
        return length * width * height;
    }
}

class Cube extends ThreeDObject {
    double side;

    Cube(double s) {
        this.side = s;
    }

    
    double wholeSurfaceArea() {
        return 6 * Math.pow(side, 2);
    }

    
    double volume() {
        return Math.pow(side, 3);
    }
}

class Cylinder extends ThreeDObject {
    double radius, height;

    Cylinder(double r, double h) {
        this.radius = r;
        this.height = h;
    }

  
    double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

  
    double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}

class Cone extends ThreeDObject {
    double radius, height;

    Cone(double r, double h) {
        this.radius = r;
        this.height = h;
    }

  
    double wholeSurfaceArea() {
        double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return Math.PI * radius * (radius + slantHeight);
    }

  
    double volume() {
        return (Math.PI * Math.pow(radius, 2) * height) / 3;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        [span_6](start
        ThreeDObject obj;

        System.out.println("--- Box ---");
        System.out.print("Enter length, width, height: ");
        obj = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        display(obj);

        System.out.println("\n--- Cube ---");
        System.out.print("Enter side: ");
        obj = new Cube(sc.nextDouble());
        display(obj);

        System.out.println("\n--- Cylinder ---");
        System.out.print("Enter radius and height: ");
        obj = new Cylinder(sc.nextDouble(), sc.nextDouble());
        display(obj);

        System.out.println("\n--- Cone ---");
        System.out.print("Enter radius and height: ");
        obj = new Cone(sc.nextDouble(), sc.nextDouble());
        display(obj);
        
        sc.close();
    }


    static void display(ThreeDObject o) {
        System.out.printf("Surface Area: %.2f\n", o.wholeSurfaceArea());
        System.out.printf("Volume: %.2f\n", o.volume());
    }
  }
