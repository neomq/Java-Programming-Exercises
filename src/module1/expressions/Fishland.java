/**
 * George decides to buy tuna fish, scads, and mussels.
 * Read the prices of mackerel and sprats, the quantity of tuna, scads, and mussels in kilograms from the console.
 *
 * Calculate how much money will George need to pay his bill, if the prices are:
 * Tuna - 60% more expensive than the mackerel
 * Scads - 80% more expensive than the sprats
 * Mussels - 7.50 dollars per kilogram
 */

package module1.expressions;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {

        String name;
        int numProjects;
        int numHours;

        Scanner input = new Scanner(System.in);

        // read
        name = input.nextLine();
        numProjects = input.nextInt();

        // calculate
        numHours = numProjects * 3;

        // print
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, numHours, numProjects);

        // close scanner
        input.close();
    }

}
