package module1.forloop;

import java.util.Scanner;

public class GreatestNum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n; // number of integers to be processed
        int num;
        int greatestNum;

        n = input.nextInt();
        num = input.nextInt();
        greatestNum = num;

        for (int i=1; i < n; i++) {
            // read the number
            num = input.nextInt();
            if (num > greatestNum) {
                greatestNum = num;
            }
        }

        // print out the greatest integer
        System.out.println(greatestNum);

        // close scanner
        input.close();

    }
}
