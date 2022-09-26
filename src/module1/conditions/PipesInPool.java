/**
 * To fill a swimming pool two pipes are to be used.
 * Its volume is V litres.
 * Each pipe has a constant flow rate.
 * Both pipes are opened simultaneously and left running for N hours.
 *
 * Create a program that calculates the volume of water in the pool after the specified time runs out.
 */

package module1.conditions;

import java.util.Scanner;

public class PipesInPool {

    public static void main(String[] args) {
        // Write your code here

        int poolVol; // in liters
        int rateFirstPipe; // liters per hr
        int rateSecondPipe; // liters per hr
        double hours;

        double firstPipeVol;
        double secondPipeVol;
        double totalWaterVol;

        Scanner input = new Scanner(System.in);

        // read
        poolVol = input.nextInt();
        rateFirstPipe = input.nextInt();
        rateSecondPipe = input.nextInt();
        hours = input.nextDouble();

        // calculate vol of water in pipes
        firstPipeVol = rateFirstPipe * hours;
        secondPipeVol = rateSecondPipe * hours;
        totalWaterVol = firstPipeVol + secondPipeVol;

        // check
        if (totalWaterVol <= poolVol) {
            // calculate percentage of water in pool
            double totalWaterVolPercent = (totalWaterVol / poolVol) * 100;

            // calculate percentage of water in each pipe
            double firstPipeVolPercent = (firstPipeVol / totalWaterVol) * 100;
            double secondPipeVolPercent = (secondPipeVol / totalWaterVol) * 100;

            // print result
            System.out.printf("The pool is %.2f%% full. ", totalWaterVolPercent);
            System.out.printf("Pipe 1: %.2f%%. ", firstPipeVolPercent);
            System.out.printf("Pipe 2: %.2f%%.", secondPipeVolPercent);

        } else {
            // calculate amount of extra water
            double extraWater = totalWaterVol - poolVol;

            // print result
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours, extraWater);
        }

        // close scanner
        input.close();
    }
}
