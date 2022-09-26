package module1.forloop;

import java.util.Scanner;

public class LatinLetters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char startLetter;
        char endLetter;

        // read
        startLetter = input.nextLine().charAt(0);
        endLetter = input.nextLine().charAt(0);

        // print
        for (char c = startLetter; c <= endLetter; c++){
            System.out.print(c + " ");
        }

        // close scanner
        input.close();

    }
}
