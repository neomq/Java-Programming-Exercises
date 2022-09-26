/**
 * Create a program to print out the given day of the week as a word:
 * Reads and integer n: the day of the week in range [1 ... 7].
 * Prints the name of the day (as a word).
 * Prints out "Error" if the number is not in the given range.
 */

package module1.conditionsadvanced;

import java.util.Scanner;

public class DayOfWeekII {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String n = input.nextLine();

        switch (n){
            case "1":
                System.out.println("Monday");
                break;
            case "2":
                System.out.println("Tuesday");
                break;
            case "3":
                System.out.println("Wednesday");
                break;
            case "4":
                System.out.println("Thursday");
                break;
            case "5":
                System.out.println("Friday");
                break;
            case "6":
                System.out.println("Saturday");
                break;
            case "7":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error");
                break;
        }

        // close scanner
        input.close();
    }
}
