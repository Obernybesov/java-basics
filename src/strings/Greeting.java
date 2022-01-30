package strings;

import java.util.Scanner;

public class Greeting {

   /* https://www.codewars.com/kata/55a70521798b14d4750000a4/train/java
    Make a function that will return a greeting statement that uses an input;
    program should return, "Hello, <name> how are you doing today?".
    Make sure you type the exact thing I wrote or the program may not execute properly]*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String userName = scanner.nextLine();
        personalGreeting(userName);

    }

    private static void personalGreeting(String name) {
        System.out.println("Hello, " + name + " how are you doing today?");
    }
}
