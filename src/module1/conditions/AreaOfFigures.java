/**
 * Create a program to calculate the area of some different figures:
 *
 * Reads a string: the figure type
 * Checks if the figure is a square, a rectangle or a circle
 * Accepts one number for a square or a circle or two numbers for a rectangle
 * numbers will be floating-point
 * Prints out the calculated area formatted to the second digit after the decimal point
 * For unknown figures print out "Unknown figure"
 */

package module1.conditions;

import java.util.Scanner;

public class AreaOfFigures {

    public static void main(String[] args) {

        String figure;
        double length;
        double width;
        double radius;
        double area;

        Scanner input = new Scanner(System.in);

        // read
        figure = input.nextLine();

        // check
        if (figure.equals("square")) {
            length = input.nextDouble();
            area = length * length;
            System.out.printf("%.2f", area);

        } else if (figure.equals("circle")) {
            radius = input.nextDouble();
            area = 3.14 * radius * radius;
            System.out.printf("%.2f", area);

        } else if (figure.equals("rectangle")) {
            length = input.nextDouble();
            width = input.nextDouble();
            area = length * width;
            System.out.printf("%.2f", area);

        } else {
            System.out.println("Unknown figure");

        }

        // close scanner
        input.close();

    }
}

