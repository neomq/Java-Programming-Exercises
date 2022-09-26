/**
 * Create a program that calculates the total cost of some animal food packages.
 * Each animal needs a package of food.
 * A package of dog food costs 2.5 dollars.
 * Any other type of animal food - 4 dollars.
 */

package module1.expressions;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {

        int dogs;
        int otherAnimals;
        double sum;

        Scanner input = new Scanner(System.in);

        // read
        dogs = input.nextInt();
        otherAnimals = input.nextInt();

        // calculate
        sum = (dogs * 2.5) + (otherAnimals * 4);

        // print
        System.out.printf("%.2f dollars", sum);

        // close scanner
        input.close();
    }

}
