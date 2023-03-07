package Strings;

import java.util.Scanner;

public class Introduction {
    public static void main(String[] args){
        // Note that String is Immutable in Java
        String name = new String("Rushan Shaikh");
        System.out.println(name);
        String name2 = "Rushan";
        System.out.println(name2);
        int a = 7;
        float b = 13.37f;
        System.out.printf("The value of a is %d and value of b is %.2f\n", a, b);
        System.out.format("The value of a is %d and value of b is %.2f\n", a, b);

        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        System.out.printf("The input value of String is : %s ", S);


    }
}
