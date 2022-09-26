/**
 * Vegetable Market
 *
 * A gardener is selling some products at the farmers market.
 * We have to help him with the calculations.
 *
 * He sells vegetables for N dollars per kilogram and fruits for M dollars per kilogram.
 * Create a program that calculates his income in euro (1 USD = 0.89 EUR).
 */

package module1.expressions;

import java.util.Scanner;

public class VegetableMarket {

    public static void main(String[] args) {

        double vegPrice;
        double fruitPrice;
        int totalVegKg;
        int totalFruitKg;
        double income;

        Scanner input = new Scanner(System.in);

        // read
        vegPrice = input.nextDouble();
        fruitPrice = input.nextDouble();
        totalVegKg = input.nextInt();
        totalFruitKg = input.nextInt();

        // calculate
        income = ((totalVegKg * vegPrice) + (totalFruitKg * fruitPrice)) * 0.89;

        // print
        System.out.printf("%.2f", income);

        // close scanner
        input.close();

    }
}
