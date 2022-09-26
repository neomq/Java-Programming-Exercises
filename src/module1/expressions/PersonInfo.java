/**
 * Create a program, which:
 * Reads 4 lines of strings: first name, last name, country and town
 * Prints information about a person in the following format:
 * "{firstName} {lastName} from {country} - {town}!"
 */

package module1.expressions;

import java.util.Scanner;

public class PersonInfo {
    public static void main(String[] args) {

        String firstName;
        String lastName;
        String country;
        String town;

        Scanner input = new Scanner(System.in);

        // read
        firstName = input.nextLine();
        lastName = input.nextLine();
        country = input.nextLine();
        town = input.nextLine();

        // print
        System.out.printf("%s %s from %s - %s!", firstName, lastName, country, town);

        // close scanner
        input.close();
    }
}