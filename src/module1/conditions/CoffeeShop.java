/**
 * Create a program to calculate the price for a particular drink in a coffee shop:
 *
 * The first line of input will be either "coffee" or "tea"
 * The second: either "sugar" or "no"
 *
 * Print the price in the following format: "Final price: ${price}"
 * the price should be formatted to the 2nd digit after the decimal point
 *
 * Prices:
 * Coffee price: 1.00
 * Tea price: 0.60
 * Sugar price: 0.40
 */

package module1.conditions;

import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {

        String drink;
        String options;
        double price = 0;

        Scanner input = new Scanner(System.in);

        // read
        drink = input.nextLine();
        options = input.nextLine();

        // check type of drink
        if (drink.equals("coffee")){
            price = 1.00;
        } else if (drink.equals("tea")){
            price = 0.60;
        }

        // check drink option
        if (options.equals("sugar")){
            price += 0.4;
        }

        // print
        System.out.printf("Final price: $%.2f", price);

        // close scanner
        input.close();

    }
}
