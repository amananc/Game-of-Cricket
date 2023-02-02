package scoreCalculator;

public class CurrentBall
{
    int[] batsmanScoreArray = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 6, 7};
    int[] ballerScoreArray = new int[]{0, 7, 1, 1, 7, 2, 3, 4, 6, 0, 1, 7};
    public int getScoreOnCurrentBallBatsman()
    {
        int randomIndex = (int)(Math.random() * 12);
        return batsmanScoreArray[randomIndex];
    }

    public int getScoreOnCurrentBallBaller()
    {
        int randomIndex = (int)(Math.random() * 12);
        return ballerScoreArray[randomIndex];
    }
}