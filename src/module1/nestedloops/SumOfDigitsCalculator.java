package module1.nestedloops;

import java.util.Scanner;

public class SumOfDigitsCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String num;
        int sumOfDigits;

        num = input.nextLine();

        while (true) {
            if (num.equals("End")){
                System.out.println("Goodbye");
                break;
            } else {
                sumOfDigits = 0; // reset value in variable
                // Calculate sum of digits here!
                for (int i = 0; i < num.length(); i++) {
                    char charDigit = num.charAt(i);
                    // convert char to string using String.valueOf();
                    // convert string to int using Integer.parseInt();
                    int intDigit = Integer.parseInt(String.valueOf(charDigit));
                    sumOfDigits += intDigit;
                }
                System.out.printf("Sum of digits = %d\n", sumOfDigits);
                num = input.nextLine();
            }
        }

        // close scanner
        input.close();

    }
}
