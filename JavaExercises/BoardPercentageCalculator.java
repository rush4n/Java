// Program to find Percentage of a Board Exam
// NOTE : Without using conditional loops
package JavaExercises;
import java.util.Scanner;
public class BoardPercentageCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the maximum marks for 1 subject : ");
        int marks = input.nextInt();
        System.out.print("Enter marks in Subject 1 : ");
        float sub1 = input.nextFloat();
        System.out.print("Enter marks in Subject 2");
        float sub2 = input.nextFloat();
        System.out.print("Enter marks in Subject 3 : ");
        float sub3 = input.nextFloat();
        System.out.print("Enter marks in Subject 4 : ");
        float sub4 = input.nextFloat();
        System.out.print("Enter marks in Subject 5 : ");
        float sub5 = input.nextFloat();
        float sum = sub1 + sub2 + sub3 + sub4 + sub5;
        int totalmarks = marks * 5;
        float Percentage = (sum/totalmarks)*100;
        System.out.print("Your Percentage for your Board Exam is : ");
        System.out.println(Percentage);





    }

}
