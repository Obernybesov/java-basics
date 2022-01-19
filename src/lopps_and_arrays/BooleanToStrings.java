package lopps_and_arrays;

import java.util.Scanner;

public class BooleanToStrings {

    /*Complete the method that takes a boolean value and return a "Yes" string for true, or a "No" string for false.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("YES or NO? Enter 1 for \"Yes\" and 2 for \"No\"");
        int selectValue = scanner.nextInt();
        boolean yesOrNo[] = {true, false};


        switch (selectValue) {
            case 1: boolToStrng(yesOrNo[0]);
            break;

            case 2: boolToStrng(yesOrNo[1]);
            break;

            default:
                System.out.println("Incorrect value");
        }

    }

    private static void boolToStrng(boolean yon) {
        if (yon) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}
