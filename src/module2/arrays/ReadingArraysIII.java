package module2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingArraysIII {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = Arrays.stream(input.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        // print
        System.out.println(Arrays.toString(numbers));

        input.close();
    }
}
