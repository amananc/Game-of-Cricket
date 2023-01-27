public class CurrentBall
{
    public static int getScoreOnCurrentBall()
    {
        int randomNumber = (int)(Math.random() * 10);
        int score = randomNumber % 8;

        return score;
    }
}
