package module1.exam;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double budget;
        int numOfNights;
        double pricePerNight;
        double additionalCost;

        double totalStayPrice = 0;
        double totalAdditionalCost;
        double totalVacationCost;

        // read
        budget = input.nextDouble();
        numOfNights = input.nextInt();
        pricePerNight = input.nextDouble();
        additionalCost = input.nextInt();

        // calculate total cost of stay
        if (numOfNights <= 7){
            totalStayPrice = pricePerNight * numOfNights;
        } else if (numOfNights > 7){
            totalStayPrice = pricePerNight * 0.95 * numOfNights;
        }

        // calculate total additional cost needed
        totalAdditionalCost = budget * (additionalCost / 100);

        // calculate total cost needed for vacation
        totalVacationCost = totalStayPrice + totalAdditionalCost;

        // compare with budget
        if (totalVacationCost <= budget){
            double moneyLeft = budget - totalVacationCost;
            System.out.printf("The Smiths will be left with %.2f dollars after the vacation.", moneyLeft);
        } else if (totalVacationCost > budget){
            double moneyNeeded = totalVacationCost - budget;
            System.out.printf("%.2f dollars needed.", moneyNeeded);
        }

        // close scanner
        input.close();
    }
}
