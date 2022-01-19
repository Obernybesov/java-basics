package lopps_and_arrays;

import java.util.Scanner;

public class QuarterOfTheYear {

    /*https://www.codewars.com/kata/5ce9c1000bab0b001134f5af
    Given a month as an integer from 1 to 12, return to which quarter of the year it belongs as an integer number.

    For example: month 2 (February), is part of the first quarter; month 6 (June), is part of the second quarter;
    and month 11 (November), is part of the fourth quarter.*/



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String quarters[]= {"First quarter", "Second quarter", "Third quarter", "Forth quarter"};
        System.out.println("Enter the number of month");
        int months = scanner.nextInt();

        switch (months) {

            case 1,2,3:
                System.out.println(quarters[0]);
                break;
            case 4,5,6:
                System.out.println(quarters[1]);
                break;
            case 7,8,9:
                System.out.println(quarters[2]);
                break;
            case 10, 11, 12:
                System.out.println(quarters[3]);
                break;
            default:
                System.out.println("Incorrect month number!");

        }

    }

}
