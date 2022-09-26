package module1.whileloop;

import java.util.Scanner;

public class DecreasingNum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        // read
        num = input.nextInt();

        while ( num > 0 ) {
            System.out.println(num);
            num --;
        }

        // close scanner
        input.close();
    }
}
