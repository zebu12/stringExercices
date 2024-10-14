package se.lexicon;

public class Main {
    public static void main(String[] args) {
        //
        //System.out.println("Hello world!");
        // lenght of String

        String s = "Java";

        int result = s.length();
        System.out.println(result);

        s = "Long exemple sentence";
        System.out.println("Char at index position 6 is : " + s.charAt(6));

        s = "Even longer exemple sentence";
        String letter = "o";
        System.out.println("the index position of '0' is : " + s.indexOf(letter));

        s = "Ok this is not as long!";
        System.out.println("the substring of s string is : " + s.substring(11));

        s = "CAPS EQUALS SCREAMING";
        System.out.println("lowercase of s string is : " + s.toLowerCase());
        System.out.println("uppercase of s string is : " + s.toUpperCase());

        s = "Java is the worst programming language!";
        System.out.println("Replace worst to best : " +s.replaceAll("worst", "best"));

    }
}