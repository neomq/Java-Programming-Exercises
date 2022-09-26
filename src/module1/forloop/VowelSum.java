package module1.forloop;

import java.util.Scanner;

public class VowelSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        char letter;
        int sum = 0;

        // read
        n = input.nextInt();

        for (int i = 0; i < n; i++){
            letter = input.next().charAt(0);

            switch (letter) {
                case 'a': sum += 1; break;
                case 'e': sum += 2; break;
                case 'i': sum += 3; break;
                case 'o': sum += 4; break;
                case 'u': sum += 5; break;
            }
        }

        // print
        System.out.println(sum);

        // close scanner
        input.close();

    }
}
