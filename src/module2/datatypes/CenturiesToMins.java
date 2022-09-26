package module2.datatypes;

import java.util.Scanner;

public class CenturiesToMins {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int centuries = input.nextInt();

        // calculate
        // 1 centuries = 100 years
        int years = centuries * 100;

        // 1 year = 365.25 days
        // double days = years * 365.2422;
        int days = (int) (years * 365.2422);

        // 1 day = 24 hours
        int hours = days * 24;

        // 1 hour = 60 mins
        int mins = hours * 60;


        // print
        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes", centuries, years, days, hours, mins);

        // close scanner
        input.close();
    }
}
