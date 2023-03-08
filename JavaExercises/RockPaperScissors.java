package JavaExercises;
import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Rock Paper and Scissors!");
        System.out.println("""
                Your Opponent will be Computer
                Please Select your choice by Entering the number  :\s
                1.Rock
                2.Paper
                3.Scissors""");
        int userInput = in.nextInt();
        int PC = ran.nextInt(1,4);

        if (userInput == PC) {
            System.out.printf("The PC's choice was %d\n", PC);
            System.out.println("That was Tie!");
        }
        else if (PC == 1 && userInput == 2 ){
            System.out.printf("The PC's choice was %d\n", PC);
            System.out.println("You Win!");
        }
        else if (PC == 1 && userInput == 3){
            System.out.printf("The PC's choice was %d\n", PC);
            System.out.println("You Lose");
        }
        else if (PC == 2 && userInput == 3){
            System.out.printf("The PC's choice was %d\n", PC);
            System.out.println("You Win!");
        }
        else if (userInput == 1 && PC == 2){
            System.out.printf("The PC's choice was %d\n", PC);
            System.out.println("You Lose!");
        }
        else if (userInput == 1 && PC == 3){
            System.out.printf("The PC's choice was %d\n", PC);
            System.out.println("You Win!");
        }
        else if (userInput == 2 && PC == 3){
            System.out.printf("The PC's choice was %d\n", PC);
            System.out.println("You Lose!");
        }
        else {
            System.out.println("Please Enter a Valid Choice");
        }

        }


    }
