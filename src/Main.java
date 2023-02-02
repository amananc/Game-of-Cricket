import playerPackage.Player;
import scoreCalculator.GameMethods;
import team.Team;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        GameController gameController = new GameController();

        Team[] teams = new Team[2];
        teams = gameController.gameStart();

        gameController.playGame(teams);

        GameMethods.printScoreCard(teams[0]);
        GameMethods.printScoreCard(teams[1]);

        gameController.declareWinner(teams);

        gameController.gameEnd();
    }
}