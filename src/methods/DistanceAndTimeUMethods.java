package methods;

import java.util.Scanner;

public class DistanceAndTimeUMethods {

    //Overwriting DistanceAndTime class using Methods


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input distance in meters:");
        float distanceInMeters = scanner.nextInt();
        System.out.println("Input hour:");
        float hours = scanner.nextInt();
        System.out.println("Input minutes:");
        float minutes = scanner.nextInt();
        System.out.println("Input seconds:");
        float seconds = scanner.nextInt();

        float kilometers = metersToKm(distanceInMeters);
        float metersPerSecond = speedInMetersPerSecond(distanceInMeters, hours, minutes, seconds);
        float kmPerHour = speedInKmPerHour(kilometers, hours, minutes, seconds);
        System.out.println("Your speed in m/s is " + metersPerSecond);
        System.out.println("Your speed in km/h is " + kmPerHour);



    }

    private static float metersToKm(float meters) {

        return meters / 1000;

    }

    private static float speedInMetersPerSecond(float met, float hours, float min, float sec) {

        return met / (hours * 3600 + min * 60 + sec);

    }

    private static float speedInKmPerHour(float km, float hours, float min, float sec) {

        return km / (hours + min / 60 + sec / 3600);

    }





}
