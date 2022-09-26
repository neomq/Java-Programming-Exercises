/**
 * Create a program that calculates the area of a trapezoid with bases b1 and b2 and height h.
 * The formula to calculate the area of a trapezoid is ((b1 + b2) / 2) * h.
 */

package module1.expressions;

import java.util.Scanner;

public class TrapezoidArea {
    public static void main(String[] args) {

        double b1;
        double b2;
        double height;
        double area;

        Scanner input = new Scanner(System.in);

        // read
        b1 = input.nextDouble();
        b2 = input.nextDouble();
        height = input.nextDouble();

        // Calculate
        area = ((b1 + b2) / 2) * height;

        // Print
        System.out.printf("%.2f", area);

        // close scanner
        input.close();

    }

}
