package conditional_expressions;

import java.util.Scanner;

            /*Is it morning, day or evening
            In case time more than 18, show Good evening, before 10 Good morning, otherwise Good day.*/


public class GoodMorning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day time");
        int dayTime = scanner.nextInt();

        String result;
        if (dayTime <=10 && dayTime >= 4) {
            result = "Good morning";
        } else if (dayTime >= 18 && dayTime < 24) {
            result = "Good evening";
        } else {result = (dayTime < 18 && dayTime > 10) ? "Good day" : "It's not time that we need";}

        System.out.println(result);

    }
}
