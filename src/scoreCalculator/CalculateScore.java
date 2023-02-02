package scoreCalculator;

import factoryPackage.PlayerType;
import generatePlayer.InputValues;
import playerPackage.Player;
import scoreCalculator.CurrentBall;
import team.Team;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CalculateScore
{
    CurrentBall currentBall = new CurrentBall();
    static int[] currentGameResult = new int[3];
    private static int maxOvers = 0, maxWickets = 0;
    int scoreOnCurrentBall = 0;

    public Team getScore(int maxScore, Team team)
    {
        int totalScore = 0;
        int totalWicket = 0;
        int totalBallsPlayed = 0;

        int batsmanAtStrikeIndex = 0, batsmanAtNonStrikeIndex = 1;
        ArrayList <Player> playerArrayList = team.getPlayersList();

        for(int currentOver = 0; currentOver < maxOvers; currentOver++)
        {
            for(int currBall = 0; currBall < 6; currBall++)
            {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                GameMethods.updateBallsPlayed(playerArrayList.get(batsmanAtStrikeIndex));
                totalBallsPlayed++;

                if(playerArrayList.get(batsmanAtStrikeIndex).getPlayerType() == PlayerType.BATSMAN)
                    scoreOnCurrentBall = currentBall.getScoreOnCurrentBallBatsman();

                else
                    scoreOnCurrentBall = currentBall.getScoreOnCurrentBallBaller();

                if(scoreOnCurrentBall > 6)
                {
                    totalWicket++;
                    System.out.print("W ");

                    int maxIndex = max(batsmanAtStrikeIndex, batsmanAtNonStrikeIndex);
                    batsmanAtStrikeIndex = maxIndex + 1;
                }
                else
                {
                    totalScore += scoreOnCurrentBall;

                    GameMethods.updateRunsScored(playerArrayList.get(batsmanAtStrikeIndex), scoreOnCurrentBall);
                    GameMethods.update4sAnd6s(playerArrayList.get(batsmanAtStrikeIndex), scoreOnCurrentBall);

                    if(GameMethods.willStrikeRotate(scoreOnCurrentBall))
                    {
                        int tempIndex = batsmanAtNonStrikeIndex;
                        batsmanAtNonStrikeIndex = batsmanAtStrikeIndex;
                        batsmanAtStrikeIndex = tempIndex;
                    }

                    System.out.print(scoreOnCurrentBall + " ");
                }

                if(totalScore > maxScore || totalWicket >= maxWickets)
                    break;
            }

            if(totalScore > maxScore || totalWicket >= maxWickets)
                break;

            System.out.println();
        }

        if(totalBallsPlayed != 6 * maxOvers)
            System.out.println();

        team.setPlayersList(playerArrayList);

        currentGameResult[0] = totalScore;
        currentGameResult[1] = totalWicket;
        currentGameResult[2] = totalBallsPlayed;

        return team;
    }


    public int getCurrentTeamScore()
    {
        return currentGameResult[0];
    }

    public int getCurrentTeamWicket()
    {
        return currentGameResult[1];
    }

    public int getCurrentTeamTotalBallsPlayed()
    {
        return currentGameResult[2];
    }

    public static void setMaxOvers(int overs)
    {
        maxOvers = overs;
    }

    public static void setMaxWickets(int wickets)
    {
        maxWickets = wickets;
    }

    int max(int firstNum, int secondNum)
    {
        if(firstNum >= secondNum)
            return firstNum;

        return secondNum;
    }

}