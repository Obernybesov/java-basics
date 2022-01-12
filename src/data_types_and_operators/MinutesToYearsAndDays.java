package data_types_and_operators;

import java.util.Scanner;

public class MinutesToYearsAndDays {

   /* Write a Java program to convert minutes into a number of years and days.
    Test Data
    Input the number of minutes: 3456789
    Expected Output :
            3456789 minutes is approximately 6 years and 210 days*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input the number of minutes: 3456789");
        int minutes = input.nextInt();

        // Number of minutes in a year
        int years = minutes / 525600;
        int remainingMins = minutes % 525600;
        int days = remainingMins / 1440;
        String devName = "Dev name: Bushmakin";
        String taskReceived = "Task received: 30/12/2021";
        String taskDone = "Task done: 05/01/2022";

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
        System.out.println(devName);
        System.out.println(taskReceived);
        System.out.println(taskDone);
    }
}
