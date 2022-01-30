package strings;

import java.util.Scanner;

public class RemoveFirstAndLastChars {

    /*https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0/train/java
    It's pretty straightforward.
    Your goal is to create a function that removes the first and last characters of a string.
    You're given one parameter, the original string.
    You don't have to worry with strings with less than two characters.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter you string");
        String userInput = scanner.nextLine();
        System.out.println(removeFirstandLast(userInput));


    }
    public static String removeFirstandLast(String str) {
        return str.substring(1, str.length() -1 );
    }

}
