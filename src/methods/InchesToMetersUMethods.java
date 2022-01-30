package methods;

import java.util.Scanner;

public class InchesToMetersUMethods {

    //Overwriting InchesToMeters class using Methods

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a value for inch:");
        double valueForInch = scanner.nextInt();
        double convertResult = inchesToMeters(valueForInch);
        System.out.println(valueForInch + " inch is " + convertResult + " meters");



    }

    private static double inchesToMeters(double convert) {

        double oneInch = 0.0254;
        return convert * oneInch;

    }

}
