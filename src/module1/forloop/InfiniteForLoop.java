package module1.forloop;

import java.util.Scanner;

public class InfiniteForLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;
        int sum = 0;

        for ( ; ; ) {
            num = input.nextInt();
            if (num == 0) {
                break;
            }
            sum = sum + num;
            System.out.println("Sum = " + sum);
        } // end of for loop

        System.out.println("Good Bye");
    }
}
