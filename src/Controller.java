public class Controller
{
    static int team1Score, team2Score, team1BallsPlayed;
    static int team1Wicket, team2Wicket, team2BallsPlayed;
    public static void gameStart()
    {
        // initializing the game

        System.out.println("Game of Cricket : Match of 20 Overs");

        Player[] team1 = new Player[11];
        Player[] team2 = new Player[11];

        // Initialising player array

        for(int i = 0; i < 11; i++)
        {
            team1[i] = new Player(GeneratePlayer.generatePlayerName(i), GeneratePlayer.generatePlayerAge(), "team1");
            team2[i] = new Player(GeneratePlayer.generatePlayerName(i + 11), GeneratePlayer.generatePlayerAge(), "team2");
        }
    }

    public static void playGame()
    {
        // Need to show wickets too... will do it later
        // Need to implement flag to check innings

        // Printing results of first innings
        System.out.println("First Innings : Team1 Playing");
        CalculateScore.getScore(1001);
        team1Score = CalculateScore.getCurrentTeamScore();
        team1Wicket = CalculateScore.getCurrentTeamWicket();
        team1BallsPlayed = CalculateScore.getCurrentTeamTotalBallsPlayed();

        System.out.println();
        System.out.println("Team1 Score : " + team1Score + " / " + team1Wicket);

        System.out.println();

        // Printing results of second innings
        System.out.println("Second Innings : Team2 Playing");
        CalculateScore.getScore(team1Score);
        team2Score = CalculateScore.getCurrentTeamScore();
        team2Wicket = CalculateScore.getCurrentTeamWicket();
        team2BallsPlayed = CalculateScore.getCurrentTeamTotalBallsPlayed();

        System.out.println();
        System.out.println("Team2 Score : " + team2Score + " / " + team2Wicket);
    }

    public static void declareWinner()
    {
        // Deciding who is the winner
        GetWinner.findOutWinner(team1Score, team2Score);
    }

    public static void gameEnd()
    {
        // Todo
    }
}
