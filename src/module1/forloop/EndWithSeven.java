/**
 * Create a program, which:
 * Reads a number n
 * Prints all numbers from 7 to n, which end in 7
 */

package module1.forloop;

import java.util.Scanner;

public class EndWithSeven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;

        // read
        n = input.nextInt();

        // print
        for (int i = 7; i <= n; i += 10){
            System.out.println(i);
        }

        // close scanner
        input.close();
    }
}
