package IntroductionToJava;
public class Operators {
    public static void main(String[] args){
        // Arithmetic Operators : +, _, *, /, %, ++, --
        int a = 10;
        int b = 6 + a;
        System.out.println(b);
        // Assignment Operator : =, +=
        b += 10;
        System.out.println(b);
        // Comparison Operator : ==, <=, >=
        System.out.println(13==37);
        // Logical Operator : &&, ||, !
        System.out.println(21>4&&21>7);
        // Bitwise Operator : &, |
        System.out.println(2&3);
    }
}
