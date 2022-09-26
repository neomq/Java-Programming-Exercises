/**
 * Create a program to calculate the price of a ticket based on the following:
 * Read the ticket type: either student or regular.
 * Print the price in the following format "${price}":
 * the price should be formatted to the 2nd digit after the decimal point.
 *
 * Student ticket price: 1.00
 * Regular ticket price: 1.60
 * For any other input print out: "Invalid ticket type!"
 */

package module1.conditions;

import java.util.Scanner;

public class Tickets {
    public static void main(String[] args) {

        String tix;
        double price;

        Scanner input = new Scanner(System.in);

        // read
        tix = input.nextLine();

        // check & print
        if (tix.equals("student")){
            price = 1.00;
            System.out.printf("$%.2f", price);
        } else if (tix.equals("regular")){
            price = 1.60;
            System.out.printf("$%.2f", price);
        } else {
            System.out.println("Invalid ticket type!");
        }

    }

}
