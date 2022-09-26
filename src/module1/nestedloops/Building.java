package module1.nestedloops;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int levels; // rows
        int units; // cols

        // read
        levels = input.nextInt();
        units = input.nextInt();

        int lastFloor = levels;

        // floor num starts at 1 (i >= 1)
        for (int i = levels; i >= 1; i--){
            if (i == lastFloor){
                // apartment num start at 0 (j = 0)
                for (int j = 0; j < units; j++) {
                    System.out.printf("L%d%d ",i ,j);
                }
                System.out.print("\n");

            } else if (i % 2 > 0) {
                // apartment num start at 0 (j = 0)
                for (int j = 0; j < units; j++) {
                    System.out.printf("A%d%d ",i ,j);
                }
                System.out.print("\n");

            } else if (i % 2 == 0) {
                // office num start at 0 (j = 0)
                for (int j = 0; j < units; j++) {
                    System.out.printf("O%d%d ",i ,j);
                }
                System.out.print("\n");
            }

        }

        // close scanner
        input.close();
    }
}
