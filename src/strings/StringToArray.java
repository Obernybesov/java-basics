package strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringToArray {

    //https://www.codewars.com/kata/57e76bc428d6fbc2d500036d/train/java
    //Write a function to split a string and convert it into an array of words.

    public static void main(String[] args) {

        String text1 = "Robin Singh";
        String text2 = "I love arrays they are my favorite";


        System.out.println(Arrays.toString(stringToArray(text1)));
        System.out.println(Arrays.toString(stringToArray(text2)));

    }

    private static String[] stringToArray(String s) {
        return s.split(" ");

    }


}
