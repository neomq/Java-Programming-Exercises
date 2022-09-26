/**
 * Create a program to check if a triangle could exist judging by the input:
 * Read 3 integers: the sides of a triangle.
 * Check if each side is less than the sum of the other 2.
 * prints "Valid Triangle" if the above condition is met.
 * prints "Invalid Triangle" otherwise.
 */

package module1.conditions;

import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {

        int sideA;
        int sideB;
        int sideC;
        int count = 0;

        Scanner input = new Scanner(System.in);

        // read
        sideA = input.nextInt();
        sideB = input.nextInt();
        sideC = input.nextInt();

        // check
        if (sideA < sideB + sideC){
            count += 1;
        }
        if (sideB < sideA + sideC){
            count += 1;
        }
        if (sideC < sideA + sideB){
            count += 1;
        }

        // print
        if (count == 3) {
            System.out.println("Valid Triangle");
        } else if (count < 3) {
            System.out.println("Invalid Triangle");
        }

        // close scanner
        input.close();
    }

}
