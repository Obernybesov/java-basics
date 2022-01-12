package data_types_and_operators;

import java.util.Scanner;

public class InchesToMeters {

    /*Write a Java program that reads a number in inches, converts it to meters.
            Note: One inch is 0.0254 meter.
            Test Data
    Input a value for inch: 1000
    Expected Output :
            1000.0 inch is 25.4 meters*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a value for inch: 1000");
        double valueForInch = scanner.nextInt();
        double oneInch = 0.0254;
        double result = valueForInch * oneInch;
        String devName = "Dev name: Bushmakin";
        String taskReceived = "Task received: 30/12/2021";
        String taskDone = "Task done: 05/01/2022";
        System.out.println(valueForInch + " inch is " + result + " meters");
        System.out.println(devName);
        System.out.println(taskReceived);
        System.out.println(taskDone);


    }
}
