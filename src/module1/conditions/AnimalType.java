/**
 * Create a program that prints out the class of an animal.
 * There are three possible output types: mammal, reptile and unknown
 *
 * dog -> mammal
 * crocodile, tortoise, snake -> reptile
 * anything else -> unknown
 */

package module1.conditions;

import java.util.Scanner;

public class AnimalType {
    public static void main(String[] args) {

        String animal;
        String type;

        Scanner input = new Scanner(System.in);

        // read
        animal = input.nextLine();

        // check
        if (animal.equals("dog")) {
            type = "mammal";
        } else if (animal.equals("crocodile")|| animal.equals("tortoise") || animal.equals("snake")) {
            type = "reptile";
        } else {
            type = "unknown";
        }

        // print
        System.out.printf("%s", type);

        // close scanner
        input.close();
    }

}