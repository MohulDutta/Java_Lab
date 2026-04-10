import java.util.*;

interface Gross{
    void calc();
}

class Employee{
    String name; int id;
    void get(Scanner sc){
        name=sc.next(); id=sc.nextInt();
    }
}

class Salary extends Employee implements Gross{
    double b,h,d,g;

    void getSal(Scanner sc){
        get(sc);
        b=sc.nextDouble();
        h=sc.nextDouble();
        d=sc.nextDouble();
    }

    public void calc(){
        g=b+h+d;
    }

    void print(){
        calc();
        System.out.println(name+" "+id+" "+g);
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Salary s=new Salary();
        s.getSal(sc);
        s.print();
    }
}
