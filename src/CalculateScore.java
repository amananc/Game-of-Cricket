
public class CalculateScore
{
    public static int getScore(int maxScore)
    {
        int totalScore = 0;
        int totalWicket = 0;

        for(int i = 0; i < 20; i++)
        {
            for(int j = 0; j < 6; j++)
            {
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

        return totalScore;
    }
}
