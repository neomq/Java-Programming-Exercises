/**
 * Create a piece of code that checks whether an object is moving fast or slow according to its speed:
 * Read the speed (a floating-point number)
 * Print "Slow" if the speed is <= 30
 * Print "Fast" if the speed is > 30
 */

package module1.conditions;

import java.util.Scanner;

public class SpeedInfo {
    public static void main(String[] args) {

        double speed;

        Scanner input = new Scanner(System.in);

        // read
        speed = input.nextDouble();

        // check
        if (speed <= 30){
            System.out.println("Slow");
        } else {
            System.out.println("Fast");
        }

        // close scanner
        input.close();
    }

}
