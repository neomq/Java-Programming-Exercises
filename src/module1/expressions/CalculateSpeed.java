/**
 * Create a program that calculates the speed of a moving vehicle
 * given the distance and time travelled.
 */

package module1.expressions;

import java.util.Scanner;

public class CalculateSpeed {

    public static void main(String[] args) {

        double dist;
        double time;
        double speed;

        // Create scanner class
        Scanner input = new Scanner(System.in);

        // Read distance input
        System.out.print("Enter distance: ");
        dist = input.nextDouble();

        // Read time input
        System.out.print("Enter time: ");
        time = input.nextDouble();

        // Calculate speed
        speed = dist / time;

        // Print result
        System.out.println(speed);
    }
}