/**
 * Create a program to check whether the input value represents a fruit or a vegetable:
 * Read a single input line: an item from the veggie store.
 * Fruits: banana, apple, kiwi, cherry, lemon, grapes.
 * Vegetables: cucumber, pepper, carrot, onion.
 * Print: "vegetable", "fruit" or "unknown".
 */

package module1.conditionsadvanced;

import java.util.Scanner;

public class FruitOrVeg {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String food = input.nextLine();

        // check
        switch(food){
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit");
                break;
            case "cucumber":
            case "pepper":
            case "carrot":
            case "onion":
                System.out.println("vegetable");
                break;
            default:
                System.out.println("unknown");
                break;
        }

        // close scanner
        input.close();
    }

}
