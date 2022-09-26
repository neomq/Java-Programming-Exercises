package module1.exam;

import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numPax; // num of people
        double entranceFee; // per person
        double sunbedPrice;
        double umbrellaPrice;

        // read
        numPax = input.nextInt();
        entranceFee = input.nextDouble();
        sunbedPrice = input.nextDouble();
        umbrellaPrice = input.nextDouble();

        // calculate cost of sunbed
        // only 75% of the group wants sunbed (round up to closest integer)
        double numOfSunbeds = Math.ceil(numPax * 0.75);
        double totalSunbedPrice = numOfSunbeds * sunbedPrice;

        // calculate cost of umbrellas
        // umbrella can provide shade for 2 pax
        double umbrellaPax = numPax - numOfSunbeds;
        double numOfUmbrellas = ((umbrellaPax - (umbrellaPax % 2)) / 2) + (umbrellaPax % 2);
        double totalUmbrellaPrice = numOfUmbrellas * umbrellaPrice;

        // calculate cost of entrance fee
        double totalEntranceFee = numPax * entranceFee;

        // calculate total cost
        double totalPrice = totalSunbedPrice + totalUmbrellaPrice + totalEntranceFee;

        // print total cost
        System.out.printf("%.2f euro", totalPrice);

        // close scanner
        input.close();
    }
}
