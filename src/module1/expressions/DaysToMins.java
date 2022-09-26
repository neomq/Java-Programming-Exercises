/**
 * Create a program to convert days to minutes:
 * Read a single integer (the days to be converted).
 * Convert the days to minutes (use calculations).
 * Print the result.
 */

package module1.expressions;

import java.util.Scanner;

public class DaysToMins {
    public static void main(String[] args) {

        int days;
        int mins;

        Scanner input = new Scanner(System.in);

        // read the days
        days = input.nextInt();

        // convert days to mins
        // 1 day = 1440 mins
        mins = days * 1440;

        // print the result
        System.out.println(mins);
    }

}
