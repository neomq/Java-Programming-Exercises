package module2.arrays;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // read input
        int num = input.nextInt();

        // initialise array
        String[] days = { "Invalid day!", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // print
        if (num >= 0 && num <= 7){
            System.out.println(days[num]);
        } else {
            System.out.println(days[0]);
        }

        input.close();
    }
}
