package conditional_expressions;

import java.util.Scanner;

public class LengthOfString {

    //Check length of string, if string more than expected print error

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int stringMaxLength = 100;
        System.out.println("Type your text. Text should contains no more than 100 characters");
        String checkedString = scanner.nextLine();

        if (checkedString.length() > 100) {
            System.out.println("Entered text is too long");
        } else {
                System.out.println("Your text is accepted. Thank you!");
        }

    }
}
