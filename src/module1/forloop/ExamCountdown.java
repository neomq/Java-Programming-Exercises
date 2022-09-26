package module1.forloop;

import java.util.Scanner;

public class ExamCountdown {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int days;

        // read
        days = input.nextInt();

        // print
        for (int i = days; i >= 0; i--){
            if (i == 0){
                System.out.println("The exam has come");
            } else {
                System.out.printf("%d days before the exam\n", i);
            }
        }

        // close scanner
        input.close();
    }
}
