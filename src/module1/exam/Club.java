package module1.exam;

import java.util.Scanner;

public class Club {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // read
        // System.out.println("Enter desired profit: ");
        double desiredProfit = Integer.parseInt(input.nextLine());
        String cocktail;
        int orderQty;

        double totalProfit = 0;

        while (true){
            // System.out.println("Enter cocktail: ");
            cocktail = input.nextLine();
            if (cocktail.equals("Party!")){
                break;
            }
            // System.out.println("Enter qty: ");
            orderQty = Integer.parseInt(input.nextLine());
            // calculate the cost of cocktail
            double orderPrice = cocktail.length() * orderQty;
            // if the price of an order is odd, add 25% discount
            if (orderPrice % 2 != 0){
                orderPrice = orderPrice * 0.75;
            }

            // add to total profit
            totalProfit += orderPrice;

            if (totalProfit >= desiredProfit){
                System.out.println("Target acquired.");
                System.out.printf("Club income - %.2f dollars.", totalProfit);
                break;
            }
        }

        if (totalProfit < desiredProfit) {
            double difference = desiredProfit - totalProfit;
            System.out.printf("We need %.2f dollars more.\n", difference);
            System.out.printf("Club income - %.2f dollars.", totalProfit);
        }

        input.close();
    }
}
