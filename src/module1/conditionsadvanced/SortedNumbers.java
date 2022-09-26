/**
 * Create a program that reads 3 numbers from the console and checks if they are sorted.
 *
 * Read 3 real numbers.
 * Print "Ascending" if the numbers are in ascending order.
 * Print "Descending" if the numbers are in descending order.
 * Print "Not sorted" in any other case.
 */

package module1.conditionsadvanced;

import java.util.Scanner;

public class SortedNumbers {
    public static void main(String[] args) {

        int num1;
        int num2;
        int num3;

        Scanner input = new Scanner(System.in);

        // read
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        if (num1 < num2 && num2 < num3) {
            System.out.println("Ascending");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("Descending");
        } else {
            System.out.println("Not sorted");
        }

        // close scanner
        input.close();
    }

}
