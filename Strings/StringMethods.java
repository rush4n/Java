package Strings;
public class StringMethods {
    public static void main(String[] args){
        // String = "Rushan"
        // Traverse  012345

        String name = "Rushan Shaikh";

        // returns length of the String
        int value = name.length();
        System.out.println(value);

        // returns a new String with only lowercase characters
        String lc = name.toLowerCase();
        System.out.println(lc);

        // returns a new string with only UPPERCASE characters
        String uc = name.toUpperCase();
        System.out.println(uc);

        // removes all trailing or leading spaces
        String nonTrimmed = "       Rushan            ";
        String Trimmed = nonTrimmed.trim();
        System.out.println(Trimmed);

        // Traversing through a String
        // String name = "Rushan Shaikh";
        //                0123456789ABC
        System.out.println(name.substring(3,10));

        // Replacing characters in a String
        System.out.println(name.replace('a','b'));

        // Replacing Strings
        String repl = "Rushan Rushan Rushan";
        System.out.println(repl.replace("Rushan", "Ryan"));

        // Check String Methods
        System.out.println(name.startsWith("R"));
        System.out.println(name.endsWith("z"));

        // print char at any index
        //String name = "Rushan Shaikh";
        System.out.println(name.charAt(3));

        // returns index of first char
        System.out.println(name.indexOf("s"));
        System.out.println(name.indexOf("s", 3)); // returns -1 if char not found

        // returns index of last character matching the string
        // String repl = "Rushan Rushan Rushan";
        System.out.println(repl.lastIndexOf("Rushan"));
        System.out.println(repl.lastIndexOf("sh", 7));


        // checks for strings
        System.out.println(name.equals("Rushan Shaikh"));
        System.out.println(name.equals("rushan shaikh")); // returns false as string is in lower case
        System.out.println(name.equalsIgnoreCase("RuShAn ShAiKh")); // ignores upper or lower case

        // Escape Sequence Characters
        System.out.println("My name is : \n\t\\Rushan Shaikh");


    }
}
