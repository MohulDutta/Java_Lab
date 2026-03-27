import java.util.Scanner;
public class StringState{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string: ");
        String str = sc.nextLine();
        int upper = 0, lower = 0, digits = 0, spaces = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch))
                upper++;
            else if(Character.isLowerCase(ch))
                lower++;
            else if(Character.isDigit(ch))
                digits++;
            else if(Character.isWhitespace(ch))
                spaces++;
            
        }
        System.out.println("uppercade letters: "+upper);
        System.out.println("lowercase letters: "+lower);
        System.out.println("digits: "+digits);
        System.out.println("spaces: "+spaces);
    }
}