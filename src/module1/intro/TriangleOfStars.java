package module1.intro;

/**
 * Create a program, which prints a triangle of stars.:
 * Print one asterisk symbol (*) for the first row, two asterisk symbols for the second row and so on.
 *
 *  *
 *  **
 *  ***
 *  ****
 *  *****
 *
 */

public class TriangleOfStars {
    public static void main(String[] args) {

        int x;
        int y;

        for (x = 1; x <= 5; x++) {
            for (y = 1; y <= x; y++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
