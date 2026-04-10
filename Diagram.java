interface Exam { void p_cal(); }

class Student {
    String n; int r; double m1, m2;
    void show() { System.out.print(n + " (" + r + ") Marks: " + m1 + "," + m2); }
}

class Result extends Student implements Exam {
    double per;
    public void p_cal() { per = (m1 + m2) / 2; }
    void disp() { show(); p_cal(); System.out.println(" | Per: " + per + "%"); }
}

public class Main {
    public static void main(String[] args) {
        Result rs = new Result();
        java.util.Scanner sc = new java.util.Scanner(System.in);
        rs.n=sc.next(); rs.r=sc.nextInt(); rs.m1=sc.nextDouble(); rs.m2=sc.nextDouble();
        rs.disp();
    }
}
