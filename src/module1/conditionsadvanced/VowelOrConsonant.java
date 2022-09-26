/**
 * Create a program to check whether a letter is a vowel or a consonant:
 * Reads a letter from the English alphabet
 * Prints out "Vowel" or "Consonant"
 */

package module1.conditionsadvanced;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String letter = input.nextLine();

        switch (letter) {
            case "a":
            case "A":
            case "e":
            case "E":
            case "i":
            case "I":
            case "o":
            case "O":
            case "u":
            case "U":
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
                break;
        }

        // close scanner
        input.close();
    }

}
