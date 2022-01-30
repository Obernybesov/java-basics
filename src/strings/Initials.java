package strings;

import java.util.Scanner;

public class Initials {

    /*https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/java
    Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
    The output should be two capital letters with a dot separating them.
    It should look like this:
    Sam Harris => S.H
    patrick feeney => P.F*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter you full name");
        String fullName = scanner.nextLine();
        fullNameToInitials(fullName);
    }

    private static void fullNameToInitials(String fullName) {
        String firstInit = Character.toString(fullName.charAt(0)).toUpperCase();
        System.out.print(firstInit + ". ");
        for (int i = 0; i < fullName.length(); i++) {
            if (Character.isWhitespace(fullName.charAt(i))) {
                System.out.print(fullName.toUpperCase().charAt(i + 1) + ". ");
            }

        }



        }

}




