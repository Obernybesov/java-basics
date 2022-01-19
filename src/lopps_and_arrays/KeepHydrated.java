package lopps_and_arrays;

import java.util.Scanner;

public class KeepHydrated {

    /*https://www.codewars.com/kata/582cb0224e56e068d800003c
    Nathan loves cycling.

    Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.

    You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value.

    For example:

    time = 3 ----> litres = 1

    time = 6.7---> litres = 3

    time = 11.8--> litres = 5*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the hours of cycling, to get volume of Nathans hydration");
        double time = scanner.nextDouble();

        if (time == 0) {
            System.out.println("Nathan needs no hydration");
        } else {
            time /= 2;
            System.out.println("Nathans hydration volume is " + time);
        }

    }

}
