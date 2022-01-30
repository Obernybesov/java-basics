package strings;

import java.util.Scanner;

public class RemoveSpacesFromString {

    //https://www.codewars.com/kata/57eae20f5500ad98e50002c5/train/java
    //Simple, remove the spaces from the string, then return the resultant string.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text with spaces");
        String textWithSpaces = scanner.nextLine();
        String textWithoutSpaces = removeSpaces(textWithSpaces);
        System.out.println(textWithoutSpaces);


    }

    private static String removeSpaces(String s) {
       return s.replace(" ", "");

    }
}
