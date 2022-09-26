package module2.arrays;

import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // read n numbers
        int n = input.nextInt();

        // initialise array and allocate memory
        int[] arr = new int[n];

        // insert values in reverse order
        for (int i = (n-1); i >= 0; i--){
            arr[i] = input.nextInt();
        }

        // print
        for (int j = 0; j < arr.length; j++){
            System.out.print(arr[j] + " ");
        }

        input.close();
    }
}
