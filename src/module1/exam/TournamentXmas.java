package module1.exam;

import java.util.Scanner;

public class TournamentXmas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numDays = Integer.parseInt(input.nextLine());

        int winCount;
        int loseCount;

        int dailyWins = 0;
        int dailyLoses = 0;

        double earnings = 0;

        for (int i = 0; i < numDays; i++){
            // reset counter
            winCount = 0;
            loseCount = 0;

            String gameResult;

            while (true){
                String gameName = input.nextLine();
                if (gameName.equals("Finish")){
                    break;
                } else {
                    gameResult = input.nextLine();
                    // check wins per game
                    if (gameResult.equals("win")){
                        winCount += 1;
                    } else if (gameResult.equals("lose")){
                        loseCount += 1;
                    }
                }
            }

            // check wins after each day
            if (winCount > loseCount) {
                dailyWins += 1;

                earnings += (winCount * 20) * 1.1;

            } else if (loseCount > winCount) {
                dailyLoses += 1;

                earnings += winCount * 20;
            }
        }

        // check wins at the end of tournament
        if (dailyWins > dailyLoses){
            earnings = earnings * 1.2;
            System.out.printf("You won the tournament! Total money raised: %.2f", earnings);
        } else if (dailyWins < dailyLoses){
            System.out.printf("You lost the tournament! Total money raised: %.2f", earnings);
        }
    }
}
