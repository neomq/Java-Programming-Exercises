/**
 * Print a square of 7 stars like this one:
 *
 *  * * * * * * *
 *  * * * * * * *
 *  * * * * * * *
 *  * * * * * * *
 *  * * * * * * *
 *  * * * * * * *
 *  * * * * * * *
 *
 */

package module1.intro;

public class SquareOfStars {
    public static void main(String[] args) {

        int i;
        int j;
        // print 7 rows
        for (i = 1; i <= 7; i++) {
            // print row of 7 stars
            for (j = 1; j <= 7; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }
}
