/**
 * Create a program to calculate a circle's area and perimeter:
 * Read a floating-point number: the radius of a circle
 * Calculate the area and perimeter of the circle.
 * Print the calculated values.
 */

package module1.expressions;

import java.util.Scanner;
import java.lang.Math;

public class CircleAreaPerimeter {
    public static void main(String[] args) {

        double radius;
        double area;
        double perimeter;

        Scanner input = new Scanner(System.in);

        // read the radius
        radius = input.nextDouble();

        // Calulate the area
        area = Math.PI * radius * radius;

        // Calculate the perimeter
        perimeter = 2 * Math.PI * radius;

        // Print the calculated values
        System.out.printf("Area = %.6f\n", area);
        System.out.printf("Perimeter = %.6f", perimeter);

        // Close scanner
        input.close();
    }
}