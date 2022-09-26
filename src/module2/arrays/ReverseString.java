package module2.arrays;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // read string separated by space
        String letters = input.nextLine();

        // declare array and insert the letters
        String[] arr = letters.split(" ");

        // print the element in reverse order
        for (int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }

        input.close();
    }
}
