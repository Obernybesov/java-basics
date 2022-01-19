package lopps_and_arrays;

import java.util.Scanner;

public class TrafficLight {

    /*https://www.codewars.com/kata/58649884a1659ed6cb000072
    You're writing code to control your town's traffic lights.
    You need a function to handle each change from green, to yellow, to red, and then to green again.

    Complete the function that takes a string as an argument representing the current state of the light
    and returns a string representing the state the light should change to.

    For example, update_light('green') should return 'yellow'.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String trafficLight[] = {"Green", "Yellow", "Red"};
        String trafficLightTitle = "Enter the current traffic light, to see the next one:";
        String updateLight = "";
        boolean newRound = true;
        while (newRound) {
            System.out.println(trafficLightTitle);
            updateLight = scanner.nextLine();

            if (updateLight.equalsIgnoreCase(trafficLight[0])) {
                System.out.println(trafficLight[1]);
            } else if (updateLight.equalsIgnoreCase(trafficLight[1])) {
                System.out.println(trafficLight[2]);
            } else if (updateLight.equalsIgnoreCase(trafficLight[2])) {
                System.out.println(trafficLight[0]);
            } else {
                System.out.println("Incorrect traffic light");
                break;
            }

        }
    }
}

