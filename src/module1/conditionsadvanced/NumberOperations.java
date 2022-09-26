/**
 * Create a program to perform a calculation using a particular operator.
 *
 * Reads two integers and a math operator from the console
 * The math operator could be: "+", "-", "/", "%" and "*"
 * The output should be in the following format: "{N1} {operator} {N2} = {result}"
 */

package module1.conditionsadvanced;

import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {

        int num1;
        int num2;
        String operator;
        int result = 0;

        Scanner input = new Scanner(System.in);

        // read
        num1 = input.nextInt();
        num2 = input.nextInt();
        operator = input.next();

        // calculate
        switch (operator) {
            case "+":
                result = num1 + num2; break;
            case "-":
                result = num1 - num2; break;
            case "/":
                result = num1 / num2; break;
            case "%":
                result = num1 % num2; break;
            case "*":
                result = num1 * num2; break;
        }

        // print
        System.out.printf("%d %s %d = %d", num1, operator, num2, result);

    }
}
