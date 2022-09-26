/**
 * Create a program, which:
 * Reads a number n from the console.
 * Prints out all numbers from 1 to n.
 * Sums all numbers from 1 to n.
 * Prints out the final sum to the console.
 */

package module1.forloop;

import java.util.Scanner;

public class SumOfNums {
    public static void main(String[] args) {

        int num;
        int sum = 0;

        Scanner input = new Scanner(System.in);

        // read
        num = input.nextInt();

        // print
        for (int i = 1; i <= num; i++){
            System.out.println(i);
            sum += i;
        }
        System.out.println(sum);

        // close scanner
        input.close();
    }
}
