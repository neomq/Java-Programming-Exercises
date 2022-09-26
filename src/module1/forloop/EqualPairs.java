/**
 * Create a program, that:
 * Reads:
 * - number n
 * - n pairs of numbers (sum up each pair and compare all sums)
 *
 * Prints:
 * - "Yes, value={sum}", if the sum of all pairs is equal
 * - Otherwise, prints "No, maxdiff={diff}"
 *
 * diff is the max difference in the sum between two pairs.
 */

package module1.forloop;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n; // number of pairs
        int num1;
        int num2;
        int sum;
        int nextSum;
        int equalCount = 0;

        // to find max diff, find the max sum and min sum of the pairs
        int maxDiff;
        int maxSum;
        int minSum;

        // read
        n = input.nextInt();
        num1 = input.nextInt();
        num2 = input.nextInt();

        // sum up the pairs
        sum = num1 + num2;
        maxSum = sum;
        minSum = sum;

        for (int i = 1; i < n; i++){
            num1 = input.nextInt();
            num2 = input.nextInt();
            nextSum = num1 + num2; // sum up the pairs and compare with sum

            if (nextSum == sum) {
                equalCount += 1; System.out.println("equal count is: " + equalCount);
            } else if (nextSum > maxSum){
                maxSum = nextSum; System.out.println("max sum is now: " + maxSum);
            } else if (nextSum < minSum){
                minSum = nextSum; System.out.println("min sum is now: " + minSum);
            }
        }

        maxDiff = maxSum - minSum;

        // print
        if (equalCount == (n-1)) {
            System.out.printf("Yes, value=%d", sum);
        } else {
            System.out.printf("No, maxdiff=%d", maxDiff);
        }

        // close scanner
        input.close();

    }
}
