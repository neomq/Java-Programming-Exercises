/**
 * Create a program that calculates the expenses for yard greening.
 * The price for one square meter is 7.61 dollars with VAT.
 * The company offers an 18% discount on the total price.
 */

package module1.expressions;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {

        double sqmToGreen;
        double initialPrice;
        double finalPrice;
        double discount;

        Scanner input = new Scanner(System.in);

        // read
        sqmToGreen = input.nextDouble();

        // calculate
        initialPrice = sqmToGreen * 7.61;
        discount = initialPrice * 0.18;
        finalPrice = initialPrice - discount;

        // print
        System.out.printf("The final price is: %.2f dollars\n", finalPrice);
        System.out.printf("The discount is: %.2f dollars", discount);

        // close scanner
        input.close();
    }
}
