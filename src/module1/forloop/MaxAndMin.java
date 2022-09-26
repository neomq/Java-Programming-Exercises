/**
 * Create a program, that:
 * Reads n representing the number of integers that the following input lines will contain
 *
 * Finds the max and the min integers.
 * Prints them to the console in the following format:
 * "Max number: {max number}"
 * "Min number: {min number}"
 */

package module1.forloop;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n; // number of integers to be processed
        int num;
        int max;
        int min;

        n = input.nextInt();
        num = input.nextInt();
        max = num;
        min = num;

        for (int i = 1; i < n; i++){
            num = input.nextInt();
            if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }
        }

        // print
        System.out.printf("Max number: %d\n", max);
        System.out.printf("Min number: %d", min);

        // close scanner
        input.close();

    }
}
