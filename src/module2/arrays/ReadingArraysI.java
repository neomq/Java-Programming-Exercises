package module2.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class ReadingArraysI {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n; // receive length of array
        n = input.nextInt();

        int[] arr = new int[n]; // declare the array and allocate memory

        // use for loop to read each array element from console
        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        // print the array
        System.out.println(Arrays.toString(arr));

        input.close();
    }
}
