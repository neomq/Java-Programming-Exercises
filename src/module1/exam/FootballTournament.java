package module1.exam;

import java.util.Scanner;

public class FootballTournament {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // read
        String footballTeam = input.nextLine();
        int numGames = Integer.parseInt(input.nextLine());

        if (numGames == 0){
            System.out.printf("%s hasn't played any games during this season.", footballTeam);
        } else if (numGames > 0) {
            int totalPoints = 0;
            int countW = 0;
            int countD = 0;
            int countL = 0;

            for (int i = 0; i < numGames; i++){
                char gameResult = input.nextLine().charAt(0);

                // calculate the points and winning count
                switch (gameResult) {
                    case 'W': totalPoints += 3; countW += 1; break;
                    case 'D': totalPoints += 1; countD += 1; break;
                    case 'L': totalPoints += 0; countL += 1; break;
                }
            }
            // calculate win rate
            double totalCount = countW + countD + countL;
            double winRate = (countW / totalCount) * 100.00;

            System.out.printf("%s has won %d points during this season.\n", footballTeam, totalPoints);
            System.out.println("Total stats:");
            System.out.printf("## W: %d\n", countW);
            System.out.printf("## D: %d\n", countD);
            System.out.printf("## L: %d\n", countL);
            System.out.printf("Win rate: %.2f%%", winRate);
        }
    }
}
