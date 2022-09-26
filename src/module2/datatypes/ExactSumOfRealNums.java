package module2.datatypes;

import java.util.Scanner;
import java.math.BigDecimal;

public class ExactSumOfRealNums {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // create new BigDecimal instance for sum
        BigDecimal sum = new BigDecimal(0);

        // read
        int n = input.nextInt();
        input.nextLine();
        // int n = Integer.parseInt(input.nextLine());

        for (int i = 1; i <= n; i++){
            BigDecimal num = new BigDecimal(input.nextLine());
            sum = sum.add(num);
        }

        // print
        System.out.println(sum);

    }
}
