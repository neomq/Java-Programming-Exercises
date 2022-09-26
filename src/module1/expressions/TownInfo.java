/**
 * Create a program, which:
 * Reads 3 lines of input: a name (string), population(integer) and area (integer)
 * Prints information about a town in the following format:
 * "Town {name} has population of {population} and area {area} square km."
 */

package module1.expressions;

import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args) {

        String name;
        int population;
        int area;

        Scanner input = new Scanner(System.in);

        // read
        name = input.nextLine();
        population = input.nextInt();
        area = input.nextInt();

        // print
        System.out.printf("Town %s has population of %d and area %d square km.", name, population, area);

        // close scanner
        input.close();
    }

}
