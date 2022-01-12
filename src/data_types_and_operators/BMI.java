package data_types_and_operators;

import java.util.Scanner;

public class BMI {
    /*Write a Java program to compute body mass index (BMI).
    Test Data
    Input weight in pounds: 452
    Input height in inches: 72
    Expected Output:
    Body Mass Index is 61.30159143458721*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input weight in pounds: 452");
        double weight = scanner.nextInt();
        System.out.println("Input height in inches: 72");
        double height = scanner.nextInt();
        double bmi = (weight / Math.pow(height,2)) * 703;
        String devName = "Dev name: Bushmakin";
        String taskReceived = "Task received: 30/12/2021";
        String taskDone = "Task done: 05/01/2022";

        System.out.println("Body Mass Index is " + bmi);
        System.out.println(devName);
        System.out.println(taskReceived);
        System.out.println(taskDone);

    }
}
