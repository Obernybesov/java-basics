package methods;

import java.util.Scanner;

public class LoginUMethods {

    //Overwriting Login class using Methods
    /* Scanner scanner = new Scanner(System.in);

    String password = "";
    int passwordLength = 0;
        System.out.println("Enter your name");
    String userName = scanner.nextLine();
        if (userName.equals("Oleksiy")) {
        System.out.println("Enter your password");
        password = scanner.nextLine();
        passwordLength = password.length();
    } else {
        System.out.println("Invalid name");
        System.exit(1);
    }

        if (password.equals("123456") && passwordLength == 6) {
        System.out.println("You successfully signed in");
    } else {
        System.out.println("Invalid password");
    }*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String userName = scanner.nextLine();
        checkUserName(userName);
        String password = scanner.nextLine();
        checkUserPassword(password);

    }

    private static void checkUserName(String name) {


        if (name.equals("Oleksiy")) {
            System.out.println("Enter your password");
        } else {
            System.out.println("Invalid name");
            System.exit(1);
        }
    }


    private static void checkUserPassword(String pass) {

        if (pass.equals("123456") && pass.length() == 6) {
            System.out.println("You successfully signed in");
        } else {
            System.out.println("Invalid password");
        }

    }

}
