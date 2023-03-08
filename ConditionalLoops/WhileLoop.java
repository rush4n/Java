package ConditionalLoops;
import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        while (i<=10){
            System.out.println(i);
            i++;
        }

    }
}
