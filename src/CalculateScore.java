
public class CalculateScore
{
    static int[] currentGameResult = new int[3];

    public static void getScore(int maxScore)
    {
        int totalScore = 0;
        int totalWicket = 0;
        int totalBallsPlayed = 0;

        for(int i = 0; i < 20; i++)
        {
            for(int j = 0; j < 6; j++)
            {
                totalBallsPlayed++;

                int scoreOnCurrentBall = CurrentBall.getScoreOnCurrentBall();

                if(scoreOnCurrentBall > 6)
                {
                    totalWicket++;
                    System.out.print("W ");
                }
                else
                {
                    totalScore += scoreOnCurrentBall;
                    System.out.print(scoreOnCurrentBall + " ");
                }

                if(totalScore > maxScore || totalWicket >= 10)
                {
                    break;
                }
            }

            if(totalScore > maxScore || totalWicket >= 10)
                break;

            System.out.println();
        }

        currentGameResult[0] = totalScore;
        currentGameResult[1] = totalWicket;
        currentGameResult[2] = totalBallsPlayed;
    }

    public static int getCurrentTeamScore()
    {
        return currentGameResult[0];
    }

    public static int getCurrentTeamWicket()
    {
        return currentGameResult[1];
    }

    public static int getCurrentTeamTotalBallsPlayed()
    {
        return currentGameResult[2];
    }

}
