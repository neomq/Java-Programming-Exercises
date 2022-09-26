package module1.exam;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String drink;
        String sugarLevel;
        int numOfDrink;

        double costOfDrink = 0;
        double totalCost;

        // read
        drink = input.nextLine();
        sugarLevel = input.nextLine();
        numOfDrink = input.nextInt();

        // determine cost of drink
        switch (drink) {
            case "Espresso":
                switch (sugarLevel) {
                    case "Without": costOfDrink = 0.9; break;
                    case "Normal": costOfDrink = 1.0; break;
                    case "Extra": costOfDrink = 1.2; break;
                }
                break;
            case "Cappuccino":
                switch (sugarLevel) {
                    case "Without": costOfDrink = 1.0; break;
                    case "Normal": costOfDrink = 1.2; break;
                    case "Extra": costOfDrink = 1.6; break;
                }
                break;
            case "Tea":
                switch (sugarLevel) {
                    case "Without": costOfDrink = 0.5; break;
                    case "Normal": costOfDrink = 0.6; break;
                    case "Extra": costOfDrink = 0.7; break;
                }
                break;
        }

        // calculate the total cost
        totalCost = costOfDrink * numOfDrink;

        // calculate the discount
        if (sugarLevel.equals("Without")){
            totalCost = totalCost * (1 - 0.35);
        }
        if (drink.equals("Espresso") && numOfDrink >= 5){
            totalCost = totalCost * (1 - 0.25);
        }
        if (totalCost > 15.00){
            totalCost = totalCost * (1 - 0.20);
        }

        // print
        System.out.printf("You bought %d cups of %s for %.2f dollars.", numOfDrink, drink, totalCost);

        // close scanner
        input.close();
    }
}
