/**
 * Your friend has 3 pets.
 * She would like to go on a trip and needs you to help her calculate whether she currently
 * has enough food to leave to her pets so that they will stay fed during her time away.
 */

package module1.conditions;

import java.util.Scanner;
import java.lang.Math;

public class Pets {
    public static void main(String[] args) {

        int numDays;
        int foodLeft; // (kg)
        double foodForDog; // per day (kg)
        double foodForCat; // per day (kg)
        double foodForTurtle; // per day (kg)

        double totalDogFood;
        double totalCatFood;
        double totalTurtleFood;
        double totalPetFood;
        double foodRemaining;
        double foodNeeded;

        Scanner input = new Scanner(System.in);

        // read
        numDays = input.nextInt();
        foodLeft = input.nextInt();
        foodForDog = input.nextDouble();
        foodForCat = input.nextDouble();
        foodForTurtle = input.nextDouble();

        // calculate total pet food
        totalDogFood = foodForDog * numDays;
        totalCatFood = foodForCat * numDays;
        totalTurtleFood = (foodForTurtle * numDays) / 1000;
        totalPetFood = totalDogFood + totalCatFood + totalTurtleFood;

        // check if food is enough
        if (totalPetFood > foodLeft) {
            foodNeeded = totalPetFood - foodLeft;
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(foodNeeded));
        } else if (totalPetFood <= foodLeft) {
            foodRemaining = foodLeft - totalPetFood;
            System.out.printf("%.0f kilos of food left.", Math.floor(foodRemaining));
        }

        // close scanner
        input.close();

    }
}
