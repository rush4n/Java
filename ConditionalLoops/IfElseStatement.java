package ConditionalLoops;
import java.util.Scanner;
public class IfElseStatement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        // If-else Condition
        if (age>=18){
            System.out.println("Yes, you can drive");
        }
        else{
            System.out.println("No, you can't drive");
        }


        int a = in.nextInt();
        int b = in.nextInt();
        boolean con = (a==b);
        if (con){
            System.out.println("The numbers are equal!");
        }
        else{
            System.out.println("The numbers are not equal!");
        }

        int c = in.nextInt();
        int d = in.nextInt();
        if (a==b && b==c){
            System.out.println("A is equal to C");
        }
        else if (a==b || b==c){
            System.out.println("A may or may not be equal to C");
        }
        else if (a!=b && b!=c){
            System.out.println("A is not equal to C");
        }
    }
}
