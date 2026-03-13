import java.util.Scanner;
class Division{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first integer:");
        int n1=sc.nextInt();
        System.out.println("Enter second integer");
        int n2=sc.nextInt();
        try {
            int  result=n1/n2;
            System.out.println("Result:" +result);
            }
            catch (ArithmeticException e){
                System.out.println("error!");
}
sc.close();
    }
}