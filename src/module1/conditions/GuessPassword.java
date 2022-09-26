/**
 * Create a program to check whether we have entered the right password or not:
 *
 * Read the input.
 * Print "Welcome" if the input password is "s3cr3t!".
 * Print "Wrong password!" in all other cases.
 */

package module1.conditions;

import java.util.Scanner;

public class GuessPassword {
    public static void main(String[] args) {

        String password;

        Scanner input = new Scanner(System.in);

        // read password
        password = input.nextLine();

        // check password
        if (password.equals("s3cr3t!")){
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }

        // close scanner
        input.close();
    }
}
