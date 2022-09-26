package module1.nestedloops;

import java.util.Scanner;

public class TriangleOfStarsII {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int height;

        // read
        height = input.nextInt();

        int x;
        int y;

        for (x = 1; x <= height; x++) {
            for (y = 1; y <= x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // close scanner
        input.close();
    }
}
