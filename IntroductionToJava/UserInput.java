package IntroductionToJava;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args){
        System.out.println("Taking Input from the user : ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = input.nextInt();
        System.out.print("Enter a number : ");
        int b = input.nextInt();
        int sum = a + b;
        System.out.print("The sum of these numbers is : ");
        System.out.println(sum);
        System.out.print("Enter a value to see if it is an integer : ");
        boolean value = input.hasNextInt();
        System.out.println(value);

        // System.out.print("Please Enter a String value : ");
        // String ab = input.nextLine();
        // System.out.println(ab);

    }
}
