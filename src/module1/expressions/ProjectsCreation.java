/**
 * Create a program that calculates how many hours will be necessary
 * for an architect to complete a given number of projects.
 * Finishing a project takes 3 hours.
 */

package module1.expressions;

import java.util.Scanner;

public class ProjectsCreation {
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
