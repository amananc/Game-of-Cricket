import java.lang.Math;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Game of Cricket : Match of 20 Overs");

        Player[] team1 = new Player[11];
        Player[] team2 = new Player[11];

        /* Initialising player array */

        for(int i = 0; i < 11; i++)
        {
            team1[i] = new Player(GeneratePlayer.generatePlayerName(i), GeneratePlayer.generatePlayerAge(), "team1");
            team2[i] = new Player(GeneratePlayer.generatePlayerName(i + 11), GeneratePlayer.generatePlayerAge(), "team2");
        }

        // Need to show wickets too... will do it later

        // Printing results of first innings
        System.out.println("First Innings : Team1 Playing");
        int team1Score = CalculateScore.getScore(1001);
        System.out.println();
        System.out.println("Team1 Score : " + team1Score);

        System.out.println();

        // Printing results of second innings
        System.out.println("Second Innings : Team2 Playing");
        int team2Score = CalculateScore.getScore(team1Score);
        System.out.println();
        System.out.println("Team2 Score : " + team2Score );

        // Deciding who is the winner
        GetWinner.findOutWinner(team1Score, team2Score);
    }
}