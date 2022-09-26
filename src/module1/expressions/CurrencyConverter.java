/**
 * Create a program to convert USD to EUR:
 * Read a floating-point number: the amount of dollars to be converted
 * Convert dollars to euro (use the exchange rate of USD to EUR: 0.88)
 * Print the converted value in EUR, formatted to the 2nd digit after the decimal point.
 */

package module1.expressions;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {

        double usd;
        double eur;

        // read amount of usd
        Scanner input = new Scanner(System.in);
        usd = input.nextDouble();

        // conversion
        // 1 USD = 0.88 EUR
        eur = usd * 0.88;

        // print converted value in euro
        System.out.printf("%.2f", eur);
    }

}
