package methods;

import java.util.Scanner;

public class RandomizerUMethods {

    //Overwriting Randomizer class using Methods
    /*Scanner scanner = new Scanner(System.in);
        System.out.println("Define range for random number generation.");
        System.out.println("Enter 1st number");
    int bottomBound = scanner.nextInt();
        System.out.println("Enter 2nd number");
    int upperBound = scanner.nextInt();
    int randomNumber = bottomBound + (int) (Math.random() * upperBound);

        System.out.println("Random number is: " + randomNumber);*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Define range for random number generation.");
        System.out.println("Enter 1st number");
        int bottomBound = scanner.nextInt();
        System.out.println("Enter 2nd number");
        int upperBound = scanner.nextInt();
        int randomNumber = randomNumber(bottomBound, upperBound);
        System.out.println("Random number is: " + randomNumber);

    }

    private static int randomNumber(int bottom, int upper) {


        return bottom + (int) (Math.random() * upper);

    }

}
