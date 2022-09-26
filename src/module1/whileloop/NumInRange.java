package module1.whileloop;

import java.util.Scanner;

public class NumInRange {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;

        // read
        n = input.nextInt();

        while (!(n >= 1 && n <= 100)){
            n = input.nextInt();
        }

        // print
        System.out.println(n);

        // close scanner
        input.close();

    }
}
