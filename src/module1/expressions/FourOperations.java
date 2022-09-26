/**
 * Create a program, which:
 * Reads 2 real numbers from the console.
 * Performs 4 arithmetic operations using these numbers each time, in the following order: +, -, *, /
 */

package module1.expressions;

import java.util.Scanner;

public class FourOperations {
    public static void main(String[] args) {

        double num1;
        double num2;

        double add;
        double sub;
        double mul;
        double div;

        Scanner input = new Scanner(System.in);

        // read num1
        num1 = input.nextDouble();

        // read num2
        num2 = input.nextDouble();

        // Perform calculations
        add = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;

        // Print the results
        System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, add);
        System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, sub);
        System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, mul);
        System.out.printf("%.2f / %.2f = %.2f", num1, num2, div);

    }

}
