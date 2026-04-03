interface Gross {
    void calculateGross();
}

class Employee {
    String name;
    int id;

    void getEmployee(String n, int i) {
        name = n;
        id = i;
    }
}

class Salary extends Employee implements Gross {

    double basic, hra, da, gross;

    void getSalary(double b) {
        basic = b;
    }

    public void calculateGross() {
        hra = basic * 0.2;
        da = basic * 0.1;
        gross = basic + hra + da;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Gross Salary: " + gross);
    }
}

public class Main4 {
    public static void main(String[] args) {

        Salary s = new Salary();

        s.getEmployee("Mahul", 101);
        s.getSalary(20000);

        s.calculateGross();
        s.display();
    }
}
