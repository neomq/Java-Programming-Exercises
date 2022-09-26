package module2.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class SumEvenNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String values = input.nextLine(); // read string of values from console

        // Store the values in an array
        String[] items = values.split(" ");

        // convert to int array
        // declare array & allocate memory
        int[] arr = new int[items.length];

        // insert each element from 'items' to 'arr'
        for (int i=0; i < items.length; i++){
            arr[i] = Integer.parseInt(items[i]);
        }

        // sum all the even values in 'arr'
        int sum = 0;

        for (int i=0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                sum += arr[i];
            }
        }

        // print
        System.out.println(sum);

    }
}
