/**
 * Calculate the final sign positive, negative or zero of the product of 3 numbers:
 *
 * Read 3 floating-point numbers.
 * Print the sign of the product of the 3 numbers: positive, negative or zero.
 * Try to do this without multiplying the numbers.
 */

package module1.conditionsadvanced;

import java.util.Scanner;

public class ProductOfThreeNums {
    public static void main(String[] args) {

        double num1;
        double num2;
        double num3;

        Scanner input = new Scanner(System.in);

        // read
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        num3 = input.nextDouble();

        // 1. if any number is 0 --> zero
        // 2. if any two numbers is (-) --> positive
        // 3. if any one number is (-) --> negative

        // check
        if (num1 == 0 || num2 == 0 || num3 == 0) {
            System.out.println("zero");
        } else if ((num1 < 0 && num2 < 0) ||
                (num1 < 0 && num3 < 0) ||
                (num2 < 0 && num3 <0) ) {
            System.out.println("positive");
        } else if (num1 < 0 || num2 < 0 || num3 < 0) {
            System.out.println("negative");
        } else if (num1 > 0 || num2 > 0 || num3 > 0) {
            System.out.println("positive");
        }

        // close scanner
        input.close();
    }
}
