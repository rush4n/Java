package IntroductionToJava;
public class DataTypes {
    public static void main(String[] args){
        byte a = 4;
        short b = 2;
        int k = a + b;
        float x = 2.223f + b;
        System.out.println(k);
        System.out.println(x);

        // Increment and Decrement Operators
        int j = 21;
        System.out.println(j++); // j = j + 1
        System.out.println(j);   // j(new)
        System.out.println(++j); // j + 1
        System.out.println(j);   // j

        char c = 'a';
        System.out.println(++c);
        System.out.println(--c);

    }
}
