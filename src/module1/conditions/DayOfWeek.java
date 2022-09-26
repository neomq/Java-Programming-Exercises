/**
 * Create a program that reads an integer [1...7] from the console
 * and prints out the corresponding word for the day of the week
 * or "Error" if the number is invalid.
 */

package module1.conditions;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        // Write your code here

        int number;
        String day;

        Scanner input = new Scanner(System.in);

        // read
        number = input.nextInt();

        // check & print
        if (number == 1) {
            System.out.println("Monday");
        } else if (number == 2) {
            System.out.println("Tuesday");
        } else if (number == 3) {
            System.out.println("Wednesday");
        } else if (number == 4) {
            System.out.println("Thursday");
        } else if (number == 5) {
            System.out.println("Friday");
        } else if (number == 6) {
            System.out.println("Saturday");
        } else if (number == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Error");
        }

        // close scanner
        input.close();
    }
}
