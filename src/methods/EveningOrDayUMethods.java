package methods;

import java.util.Scanner;

public class EveningOrDayUMethods {

    //Overwriting GoodEveningOrDay class using Methods

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter day time");
        int dayTime = scanner.nextInt();
        greetingAccordingTimeOfDay(dayTime);

    }

    private static void greetingAccordingTimeOfDay(int time) {
        if (time >= 18 && time <= 24) {
            System.out.println("Good evening");
        } else if (time > 24) {
            System.out.println("There is no such time");
        } else {
            System.out.println("Good day");
        }
    }


}
