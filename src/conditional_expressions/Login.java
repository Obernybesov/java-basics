package conditional_expressions;

import java.util.Scanner;

public class Login {

    /*Create program that login you in system. Check password length. Example:
    Enter your name: Yuriy (in case wrong login print error)
    Enter your password: pass (in case wrong pass print error)*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

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
        }
        
    }
}
