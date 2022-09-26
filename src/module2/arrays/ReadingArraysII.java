/**
 * Read an Array from a single line of separated values
 */

package module2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingArraysII {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String values = input.nextLine(); // read a single line of values separated by space
        String[] items = values.split(" "); // create an array to store the string values

        int[] arr = new int[items.length]; // declare array for the values and allocate memory

        // use for loop to insert each array element (converted to int) from the 'items' array
        for (int i=0; i<items.length; i++){
            arr[i] = Integer.parseInt(items[i]);
        }

        // print
        System.out.println(Arrays.toString(arr));

        input.close();

    }
}
