package methods;

import java.util.Scanner;

public class MinutesToYearsAndDaysUMethods {

    //Overwriting MinutesToYearsAndDays class using Methods

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input the number of minutes:");
        int minutes = input.nextInt();
        minutesToYears(minutes);

    }

    private static void minutesToYears(int min) {

            int years = min / 525600;
            int remainingMins = min % 525600;
            int days = remainingMins / 1440;
        System.out.println(min + " minutes is approximately " + years + " years and " + days + " days");


    }

}
