/**
 * Create a program, which checks whether the water in a pot is boiling:
 * Read a floating-point number: the water temperature (in °C).
 * Print out "The water is boiling" if the number > 100.
 * Print out "The water is not hot enough" in all other cases.
 */

package module1.conditions;

import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {

        double temp;

        Scanner input = new Scanner(System.in);

        // read
        temp = input.nextDouble();

        // check
        if (temp > 100) {
            System.out.println("The water is boiling");
        } else {
            System.out.println("The water is not hot enough");
        }

        // close scanner
        input.close();
    }

}
