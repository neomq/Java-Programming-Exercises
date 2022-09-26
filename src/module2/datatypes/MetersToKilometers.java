package module2.datatypes;

import java.util.Scanner;

public class MetersToKilometers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int meters = input.nextInt();

        double kilometers = meters / 1000.0;

        // print
        System.out.printf("%.2f", kilometers);

        input.close();


    }
}
