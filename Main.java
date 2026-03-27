 import java.util.Scanner;
 class Point{
    int x,y;
    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
 }
 class Circle{
    Point center;
    double radius;

    Circle(int x, int y, double radius)
    {
        center = new Point(x,y);
        this.radius = radius;
    }
    void display(){
        double area = Math.PI*radius*radius;
        System.out.println("center point: (" +center.x + "," + center.y + ")");
        System.out.println("radius: " +radius);
        System.out.println("area:" +area);

    }
 }
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the x coordinate:");
        int x = sc.nextInt();
        System.out.println("enter the y coordinate:");
        int y = sc.nextInt();
        System.out.println("enter radius:");
        double r = sc.nextDouble();
        Circle c = new Circle(x,y,r);
        c.display();
    }
}