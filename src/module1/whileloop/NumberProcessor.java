package module1.whileloop;

import java.util.Scanner;

public class NumberProcessor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;
        String command;

        // read
        num = input.nextInt();
        command = input.nextLine();

        while (!(command.equals("END"))){
            command = input.nextLine();

            switch (command) {
                case "Add": num += 1; break;
                case "Subtract": num -= 1; break;
            }
        }

        // print
        System.out.println(num);

        // close scanner
        input.close();
    }
}
