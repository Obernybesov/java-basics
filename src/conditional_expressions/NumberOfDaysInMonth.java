package conditional_expressions;

import java.util.Scanner;

public class NumberOfDaysInMonth {

    /*Write a Java program to find the number of days in a month.
            Test Data
    Input a month number: 2
    Input a year: 2016

    Expected Output :
    February 2016 has 29 days*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a month number:");
        int month = scanner.nextInt();
        System.out.println("Input a year:");
        int year = scanner.nextInt();

        if (month == 2 && year % 4 == 0) {
            System.out.println("February " + year + " has 29 days");
        } else {
            switch (month) {
                case 1:
                    System.out.println("January " + year + " has 31 days");
                    break;
                case 2:
                    System.out.println("February " + year + " has 28 days");
                    break;
                case 3:
                    System.out.println("March " + year + " has 31 days");
                    break;
                case 4:
                    System.out.println("April " + year + " has 30 days");
                    break;
                case 5:
                    System.out.println("May " + year + " has 31 days");
                    break;
                case 6:
                    System.out.println("June " + year + " has 30 days");
                    break;
                case 7:
                    System.out.println("July " + year + " has 31 days");
                    break;
                case 8:
                    System.out.println("August " + year + " has 31 days");
                    break;
                case 9:
                    System.out.println("September " + year + " has 30 days");
                    break;
                case 10:
                    System.out.println("October " + year + " has 31 days");
                    break;
                case 11:
                    System.out.println("November " + year + " has 30 days");
                    break;
                case 12:
                    System.out.println("December " + year + " has 31 days");
                    break;
                default:
                    System.out.println("Such month is not exist");
            }
        }


    }

}
