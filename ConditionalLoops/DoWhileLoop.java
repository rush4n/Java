package ConditionalLoops;
import java.util.Scanner;
public class DoWhileLoop {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you want to print numbers from : ");
        int i = in.nextInt();
        System.out.print("Enter the last number till you want to print : ");
        int n = in.nextInt();
        do {
            System.out.println(i);
            i++;
        }while (i<=n);

    }
}
