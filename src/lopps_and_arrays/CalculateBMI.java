package lopps_and_arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CalculateBMI {

    /*https://www.codewars.com/kata/57a429e253ba3381850000fb
    Write function bmi that calculates body mass index (bmi = weight / height2).

            if bmi <= 18.5 return "Underweight"

            if bmi <= 25.0 return "Normal"

            if bmi <= 30.0 return "Overweight"

            if bmi > 30 return "Obese"*/


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String bmiResult[] = {"Underweight ", "Normal ", "Overweight ", "Obese "};
        System.out.println("Enter your weight (kg):");
        double weight = scanner.nextDouble();
        System.out.println("Enter your height (sm):");
        double height = scanner.nextDouble();
        double bmi = Math.round(calculateBMI(weight, height));

        if (bmi <= 18.5) {
            System.out.println(bmiResult[0] + bmi);
        } else if (bmi <= 25.0 && bmi >= 18.6) {
            System.out.println(bmiResult[1] + bmi);
        } else if (bmi <= 30.0 && bmi >= 25.1) {
            System.out.println(bmiResult[2] + bmi);
        } else {
            System.out.println(bmiResult[3] + bmi);
        }


    }
    private static double calculateBMI(double w, double h) {
        return  w / Math.pow(h / 100, 2);

    }


}
