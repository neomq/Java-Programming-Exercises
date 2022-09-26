package module2.datatypes;

import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double pounds = input.nextDouble();

        // 1 British Pound = 1.31 Dollars
        double dollars = pounds * 1.31;

        // print
        System.out.printf("%.3f", dollars);

        input.close();
    }
}
