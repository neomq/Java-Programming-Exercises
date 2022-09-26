/**
 * Create a console program that reads an integer a and calculates the area of a square with a side a.
 */

package module1.expressions;

import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        int a;
        int area;

        Scanner input = new Scanner(System.in);

        // read
        a = input.nextInt();

        // calculate
        area = a * a;

        // print
        System.out.print(area);

        // close scanner
        input.close();
    }
}
