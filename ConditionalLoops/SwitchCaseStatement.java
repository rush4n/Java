package ConditionalLoops;
import java.util.Scanner;
public class SwitchCaseStatement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        switch (age){
            case 18:
                System.out.println("You're going to become an adult");
                break;
            case 21:
                System.out.println("You're going to pass out college");
                break;
            case 27:
                System.out.println("Do a job!");
                break;
            case 60:
                System.out.println("Retire");
                break;
            default:
                System.out.println("Enjoy your life!");
        }
        System.out.println("Code Successfully Executed");


        // enhanced switch
        String name = "Rushan";

        switch (name) {
            case "Saleha" -> System.out.println("You're going to become an adult");
            case "Anwar" -> System.out.println("You're going to pass out college");
            case "Raju" -> System.out.println("Do a job!");
            case "Chote" -> System.out.println("Retire");
            default -> System.out.println("Enjoy your life!");
        }
    }
}
