package lopps_and_arrays;

import java.util.Scanner;

public class FlowersForLovers {

    /*https://www.codewars.com/kata/555086d53eac039a2a000083
    Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower each.
    If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.

    Write a function that will take the number of petals of each flower and return true if they are in love and false if they aren't.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Petals amount of Timmy's flower:");
        int timmyFlower = scanner.nextInt();
        System.out.println("Petals amount of Sarah's flower");
        int sarahFlower = scanner.nextInt();
        boolean inLove = true;
        boolean notInLove = false;

        if (timmyFlower % 2 == 0 && sarahFlower % 2 == 0) {
            System.out.println(notInLove);
        } else if (timmyFlower % 2 != 0 && sarahFlower % 2 != 0) {
            System.out.println(notInLove);

        } else {
            System.out.println(inLove);
        }



    }

}
