package data_types_and_operators;

import java.util.Scanner;

public class Randomizer {

    /*Write a Java program to generate random integers in a specific range.(Hint: Use Math class)*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Define range for random number generation.");
        System.out.println("Enter 1st number");
        int bottomBound = scanner.nextInt();
        System.out.println("Enter 2nd number");
        int upperBound = scanner.nextInt();
        String devName = "Dev name: Bushmakin";
        String taskReceived = "Task received: 30/12/2021";
        String taskDone = "Task done: 05/01/2022";
        int randomNumber = bottomBound + (int) (Math.random() * upperBound);

        System.out.println("Random number is: " + randomNumber);
        System.out.println(devName);
        System.out.println(taskReceived);
        System.out.println(taskDone);




    }
}
