/**
 * Create a program that receives two integers representing an exact time in the format:
 * "{hours}:{minutes}"
 * and prints out what the time will be after 15 minutes.
 */

package module1.conditions;

import java.util.Scanner;

public class TimePlusFifteenMins {
    public static void main(String[] args) {

        int hours;
        int mins;

        Scanner input = new Scanner(System.in);

        // read
        hours = input.nextInt();
        mins = input.nextInt();

        // calculate
        int totalMins = mins + 15;
        int finalMins;
        if (totalMins >= 60) {
            hours += 1;
            finalMins = totalMins - 60;
        } else {
            finalMins = totalMins;
        }

        // print
        String outputMins;
        int outputHours = 0;

        if (finalMins < 10) {
            outputMins = "0" + finalMins;
        } else {
            outputMins = Integer.toString(finalMins);
        }

        if (hours < 24) {
            outputHours = hours;
        }

        System.out.printf("%d:%s", outputHours, outputMins);
    }
}
