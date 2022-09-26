/**
 * Calculate the total price for all sold tickets to a movie screening in a cinema:
 * Reads the type of the movie, the rows and the seats per row in the cinema.
 * Prints the total price for all seats formatted to the 2nd digit after the decimal point.
 *
 * Premiere: 12.00
 * Normal: 7.50
 * Discount: 5.00
 */

package module1.conditionsadvanced;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {

        String movieType;
        double moviePrice = 0;
        int numRows;
        int seatsPerRow;
        double totalPrice;

        Scanner input = new Scanner(System.in);

        // read
        movieType = input.nextLine();
        numRows = input.nextInt();
        seatsPerRow = input.nextInt();

        // check
        switch (movieType) {
            case "Premiere":
                moviePrice = 12.00;
                break;
            case "Normal":
                moviePrice = 7.50;
                break;
            case "Discount":
                moviePrice = 5.00;
                break;
        }

        // calculate total price
        totalPrice = moviePrice * numRows * seatsPerRow;

        // print
        System.out.printf("%.2f", totalPrice);

        // close scanner
        input.close();
    }
}
