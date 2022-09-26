/**
 * Create a program that calculates vacation expenses based on the following factors:
 * > Season
 * > Accommodation type
 * > Number of days
 *
 * Prints the total expenses, based on the price table bellow, formatted to the 2nd digit after the decimal point
 */

package module1.conditionsadvanced;

import java.util.Scanner;

public class VacationExpenses {
    public static void main(String[] args) {

        String season;
        String accomodation;
        int numDays;

        int cost = 0;
        double discount = 0;
        double totalExpense;

        Scanner input = new Scanner(System.in);

        // read
        season = input.nextLine();
        accomodation = input.nextLine();
        numDays = input.nextInt();

        // check
        switch (season) {
            case "Spring":
                discount = 0.2;
                switch (accomodation) {
                    case "Hotel":
                        cost = 30;
                        break;
                    case "Camping":
                        cost = 10;
                        break;
                }
                break;
            case "Summer":
                discount = 0;
                switch (accomodation) {
                    case "Hotel":
                        cost = 50;
                        break;
                    case "Camping":
                        cost = 30;
                        break;
                }
                break;
            case "Autumn":
                discount = 0.3;
                switch (accomodation) {
                    case "Hotel":
                        cost = 20;
                        break;
                    case "Camping":
                        cost = 15;
                        break;
                }
                break;
            case "Winter":
                discount = 0.1;
                switch (accomodation) {
                    case "Hotel":
                        cost = 40;
                        break;
                    case "Camping":
                        cost = 10;
                        break;
                }
                break;
        } // end switch

        // calculate total expense after discount
        totalExpense = cost * numDays * (1 - discount);

        // print
        System.out.printf("%.2f", totalExpense);

        // close scanner
        input.close();
    }
}