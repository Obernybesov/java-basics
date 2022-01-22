package methods;

import java.util.Scanner;

public class LengthOfStringUMethods {

    //Overwriting LengthOfString class using Methods

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your text. Text should contains no more than 100 characters");
        String checkedString = scanner.nextLine();
        checkStringLength(checkedString);

    }

    private static void checkStringLength(String check) {

        if (check.length() > 100) {
            System.out.println("Entered text is too long");
        } else {
            System.out.println("Your text is accepted. Thank you!");

        }

    }
}
