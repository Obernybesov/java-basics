package methods;

import java.util.Scanner;

public class GoodMorningUMethods {

    //Overwriting GoodMorning class using Methods


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter day time");
        int dayTime = scanner.nextInt();
        String suitableGreeting = greetingAccordingTimeOfDay(dayTime);
        System.out.println(suitableGreeting);

    }

    private static String greetingAccordingTimeOfDay(int time) {

        String result;
        if (time <=10 && time >= 4) {
            result = "Good morning";
        } else if (time >= 18 && time < 24) {
            result = "Good evening";
        } else {result = (time < 18 && time > 10) ? "Good day" : "It's not time that we need";}
        return result;

    }

}
