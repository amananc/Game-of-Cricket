import team.Team;

public class GetWinner
{
    public static void findOutWinner(int team1Score, int team2Score, Team[] teams)
    {
        if(team1Score > team2Score)
        {
            System.out.print("The Winner is : ");
            System.out.println(teams[0].getTeamName());
        }

        else if(team1Score == team2Score)
        {
            System.out.println("Match Draw");
        }

        else
        {
            System.out.print("The Winner is : ");
            System.out.println(teams[1].getTeamName());
        }
    }
}