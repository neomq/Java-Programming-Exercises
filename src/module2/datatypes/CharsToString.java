package module2.datatypes;

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char char1 = input.nextLine().charAt(0);
        char char2 = input.nextLine().charAt(0);
        char char3 = input.nextLine().charAt(0);

        // print
        System.out.println("" + char1 + char2 + char3);

        // Alternatively,
        String first = String.valueOf(char1);
        String second = String.valueOf(char2);
        String third = String.valueOf(char3);

        System.out.println(first + second + third);

        // close scanner
        input.close();
    }
}
