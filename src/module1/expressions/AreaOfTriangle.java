/**
 * Create a program to calculate the area of a triangle:
 * Read as input side - a and height - h - floating-point numbers
 * Calculate the area of the triangle
 * Print the area, formatted to the 2nd digit after the decimal point
 */

package module1.expressions;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {

        double a;
        double h;
        double area;

        Scanner input = new Scanner(System.in);

        // Read side - a
        a = input.nextDouble();

        // Read height - h
        h = input.nextDouble();

        // Calculate area
        area = 0.5 * a * h;

        // Print the area
        System.out.printf("%.2f", area);

    }

}
