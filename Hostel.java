import java.util.Scanner;

interface Department {
    String deptName = "CSE";
    String deptHead = "Dr. Sen";

    void printDeptData();
}

class Hostel {
    String hostelName;
    String hostelLocation;
    int numberOfRooms;

    void getHostelData(Scanner sc) {
        System.out.print("Enter Hostel Name: ");
        hostelName = sc.nextLine();

        System.out.print("Enter Hostel Location: ");
        hostelLocation = sc.nextLine();

        System.out.print("Enter Number of Rooms: ");
        numberOfRooms = sc.nextInt();
        sc.nextLine();
    }

    void printHostelData() {
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Hostel Location: " + hostelLocation);
        System.out.println("Number of Rooms: " + numberOfRooms);
    }
}

class Student extends Hostel implements Department {

    String studentName;
    int regdNo;
    String electiveSubject;
    double avgMarks;

    void getData(Scanner sc) {

        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();

        System.out.print("Enter Registration No: ");
        regdNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Elective Subject: ");
        electiveSubject = sc.nextLine();

        System.out.print("Enter Average Marks: ");
        avgMarks = sc.nextDouble();
        sc.nextLine();

        getHostelData(sc);
    }

    void printData() {
        System.out.println("\n----- Student Details -----");
        System.out.println("Student Name: " + studentName);
        System.out.println("Regd No: " + regdNo);
        System.out.println("Elective Subject: " + electiveSubject);
        System.out.println("Average Marks: " + avgMarks);

        printHostelData();
        printDeptData();
    }

    public void printDeptData() {
        System.out.println("Department Name: " + deptName);
        System.out.println("Department Head: " + deptHead);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        int choice;

        do {
            System.out.println("\n1. Admit New Student");
            System.out.println("2. Migrate Student");
            System.out.println("3. Display Details");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    s.getData(sc);
                    break;

                case 2:
                    System.out.print("Enter Registration No to search: ");
                    int r = sc.nextInt();

                    if (r == s.regdNo) {
                        System.out.println("Student Migrated Successfully");
                    } else {
                        System.out.println("Student Not Found");
                    }
                    break;

                case 3:
                    s.printData();
                    break;
            }

        } while (choice != 4);
    }
}
