/**
 * Create a program, that:
 * Reads a number from the console
 * Finds all 3-digit numbers that produce this number when multiplying all their digits by each other.
 *
 * Example:
 * 113 = 1*1*3 == 3
 * 131 = 1*3*1 == 3
 * 311 = 3*1*1 == 3
 */

package module1.nestedloops;

import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int sum;

        // generate all possible multiplications
        for (int i=0; i<=9; i++){
            for (int j=0; j<=9; j++) {
                for (int k=0; k<=9; k++) {
                    // System.out.printf("%d x %d x %d\n", i, j, k);
                    sum = i * j * k;
                    if (sum == num) {
                        System.out.printf("%d%d%d\n", i, j, k);
                    }
                }
            }
        }

        // close scanner
        input.close();
    }
}
