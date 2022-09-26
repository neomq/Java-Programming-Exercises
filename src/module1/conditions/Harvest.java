/**
 * The Happy Wine Brothers Company has asked you to create a simple program to calculate
 * whether they will be able to reach their wine production goals in one of their vineyards.
 * This vineyard is responsible for 40% of the total wine production.
 *
 * Let us assume that 1 square meter of land yields Y kilos of grapes. This value will be provided as input.
 * To produce 1 liter we need 2.5kg of grapes.
 *
 * The company has set a goal to produce a certain volume of wine.
 * That number will be in litres and you will receive it as input.
 *
 * Create a program that calculates how much wine can be produced,
 * and whether this quantity is enough for the company to reach its production goal.
 * If the produced amount is sufficient to meet the goal,
 * the remaining wine is distributed among the workers at the vineyard.
 */

package module1.conditions;

import java.util.Scanner;
import java.lang.Math;

public class Harvest {
    public static void main(String[] args) {

        int yardSize; // vineyard size in sq meters
        double yield; // yield per sq meter
        int goal; // production goal in liters
        int workers; // num of workers

        double totalYield;
        double totalWine;

        Scanner input = new Scanner(System.in);

        // read
        yardSize = input.nextInt();
        yield = input.nextDouble();
        goal = input.nextInt();
        workers = input.nextInt();

        // calculate
        totalYield = yield * yardSize; // in kg
        totalWine = (totalYield * 0.4) / 2.5;

        // check
        if (totalWine < goal) {

            double remainingWine = goal - totalWine;

            System.out.printf("It will be a tough winter! %.0f liters of wine needed to reach the goal.", Math.floor(remainingWine));

        } else if (totalWine >= goal) {

            double remainingWine = totalWine - goal;
            double winePerWorker = remainingWine / workers;

            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n", Math.floor(totalWine));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(remainingWine), Math.ceil(winePerWorker));
        }

        // close scanner
        input.close();
    }
}
