package conditional_expressions;

import java.util.Scanner;

public class GoodEveningOrDay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter day time");
        int dayTime = scanner.nextInt();

        if (dayTime >= 18 && dayTime <= 24) {
            System.out.println("Good evening");
        } else if (dayTime > 24) {
            System.out.println("There is no such time");
        } else {
            System.out.println("Good day");
        }
    }
}
