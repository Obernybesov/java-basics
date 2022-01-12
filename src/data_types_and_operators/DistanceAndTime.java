package data_types_and_operators;

import java.util.Scanner;

public class DistanceAndTime {
    /*Write a Java program to takes the user for a distance (in meters) and the time was taken
    (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometres per hour

    Test Data
    Input distance in meters: 2500
    Input hour: 5
    Input minutes: 56
    Input seconds: 23
    Expected Output :
    Your speed in meters/second is 0.11691531
    Your speed in km/h is 0.42089513*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input distance in meters: 2500");
        float distanceInMeters = scanner.nextInt();
        System.out.println("Input hour: 5");
        float hours = scanner.nextInt();
        System.out.println("Input minutes: 56");
        float minutes = scanner.nextInt();
        System.out.println("Input seconds: 23");
        float seconds = scanner.nextInt();
        float metersToKm = distanceInMeters / 1000;
        float speedInMetPerSeconds = distanceInMeters / (hours * 3600 + minutes * 60 + seconds);
        float speedInKmH = metersToKm / (hours + minutes / 60 + seconds / 3600);
        String devName = "Dev name: Bushmakin";
        String taskReceived = "Task received: 30/12/2021";
        String taskDone = "Task done: 05/01/2022";

        System.out.println("Your speed in meters/second is " + speedInMetPerSeconds);
        System.out.println("Your speed in km/h is " + speedInKmH);
        System.out.println(devName);
        System.out.println(taskReceived);
        System.out.println(taskDone);
    }
}
