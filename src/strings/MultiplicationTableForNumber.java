package strings;

import java.util.Scanner;

public class MultiplicationTableForNumber {

    //https://www.codewars.com/kata/5a2fd38b55519ed98f0000ce/train/java
    /*Your goal is to return multiplication table for number that is always an integer from 1 to 10.
    For example, a multiplication table (string) for number == 5 looks like below:
    1 * 5 = 5
    2 * 5 = 10
    3 * 5 = 15
    4 * 5 = 20
    5 * 5 = 25
    6 * 5 = 30
    7 * 5 = 35
    8 * 5 = 40
    9 * 5 = 45
    10 * 5 = 50*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number from 1 to 10 (inclusive)");
        int number = scanner.nextInt();
        getMultTableForNumber(number);
        }


    private static void getMultTableForNumber(int number) {
        if (number > 10 || number <= 0){
            System.out.println("Incorrect number");
        } else {for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d \n", number, i, number * i);
        }
        }
    }
}
