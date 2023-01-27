public class GetWinner
{
    public static void findOutWinner(int team1Score, int team2Score)
    {
        if(team1Score > team2Score)
        {
            System.out.println("Team 1 Wins");
        }

        else if(team1Score == team2Score)
        {
            System.out.println("Match Draw");
        }

        else
        {
            System.out.println("Team 2 Wins");
        }
    }
}
