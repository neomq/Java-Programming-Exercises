package module1.nestedloops;

import java.util.Scanner;

public class NestedWhileLoops {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int rows;
        int cols;

        // read
        System.out.print("Enter number of rows: ");
        rows = input.nextInt();
        System.out.print("Enter number of cols: ");
        cols = input.nextInt();

        System.out.print("\n");

        int row = 1;
        while (row <= rows) {
            System.out.printf("row%d: ", row);

            int col = 1;
            while (col <= cols){
                System.out.printf("col%d ", col);
                col++;
            }

            System.out.print("\n");
            row++;
        }
    }
}
