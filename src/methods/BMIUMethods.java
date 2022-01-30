package methods;

import java.util.Scanner;

public class BMIUMethods {

    //Overwriting BMI class using Methods

            public static void main(String[]args){
                Scanner scanner = new Scanner(System.in);

                System.out.println("Input weight in pounds:");
                double weight = scanner.nextInt();
                System.out.println("Input height in inches:");
                double height = scanner.nextInt();
                double result = Math.round(calculateBMI(weight, height));
                System.out.println("Body Mass Index is " + result);

        }

        private static double calculateBMI(double w, double h) {
                return (w / Math.pow(h, 2)) * 703;
        }

}
