package scoreCalculator;

import playerPackage.Player;
import team.Team;

import java.util.ArrayList;

public class GameMethods
{
    // Checking if the
    public static boolean willStrikeRotate(int scoreOnCurrentBall)
    {
        return scoreOnCurrentBall % 2 != 0;
    }

    public static void updateBallsPlayed(Player player)
    {
        player.setBallsPlayed(player.getBallsPlayed() + 1);
    }

    public static void updateRunsScored(Player player, int runsScoredOnCurrentBall)
    {
        player.setRunsScored(player.getRunsScored() + runsScoredOnCurrentBall);
    }

    public static void update4sAnd6s(Player player, int runsScoredOnCurrentBall)
    {
        if(runsScoredOnCurrentBall == 4)
            player.setTotal4Scored(player.getTotal4Scored() + 1);

        if(runsScoredOnCurrentBall == 6)
            player.setTotal6Scored(player.getTotal6Scored() + 1);
    }

    public static void printScoreCard(Team team)
    {
        System.out.println("Team " + team.getTeamName() + " Score : ");

        ArrayList<Player> playerArrayList = team.getPlayersList();

        // printing the list objects in tabular format
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.printf("%15s %15s %15s %15s %15s %15s", "PLAYER NAME", "RUNS SCORED", "BALLS FACED", "4s", "6s", "STRIKE RATE");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------");

        for(Player player : playerArrayList)
        {
            int strikeRate = calculateStrikeRate(player.getRunsScored(), player.getBallsPlayed());

            System.out.format("%10s %15s %15s %20s %15s %10s", player.getName(), player.getRunsScored(), player.getBallsPlayed(), player.getTotal4Scored(), player.getTotal6Scored(), strikeRate);
            System.out.println();
        }

        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println();
    }

    public static int calculateStrikeRate(int runsScored, int ballsPlayed)
    {
        if(ballsPlayed == 0)
            return 0;

        int strikeRate = (100 * runsScored) / ballsPlayed;
        return strikeRate;
    }

}
