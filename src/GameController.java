import generatePlayer.InputValues;
import scoreCalculator.CalculateScore;
import team.Team;

import java.util.Scanner;

public class GameController
{
    CalculateScore calculateScore = new CalculateScore();
    Toss toss = new Toss();
    int team1Score, team2Score, teamWicket, teamBallsPlayed;

    Team team1, team2;
    Team[] teams;
    private int totalNumberOfOvers = 0, totalNumberOfPlayers = 0;
    public Team[] gameStart()
    {
        totalNumberOfOvers = InputValues.getTotalOversInput();
        totalNumberOfPlayers = InputValues.getTotalPlayersInput();

        team1 = new Team();
        team2 = new Team();

        teams = new Team[2];
        teams[0] = team1;
        teams[1] = team2;

        boolean decision = tossDecision();
        if(!decision)
            swap();

        return teams;
    }

    public boolean tossDecision()
    {
        System.out.print("Please press 1 for selecting heads and 2 for selecting tails : ");

        Scanner sc = new Scanner(System.in);
        int inputValue = 1;

        try {
            inputValue = sc.nextInt();
        }
        catch (Exception e) {
            System.out.println("Invalid Input, By default you have chosen heads");
        }

        boolean finalDecision;

        if(inputValue == 1)
            finalDecision = toss.tossTheCoin(true, teams);

        else if(inputValue == 2)
            finalDecision = toss.tossTheCoin(false, teams);

        else
        {
            System.out.println("Please enter valid input");
            return tossDecision();
        }

        return finalDecision;
    }

    public void playGame(Team[] teams)
    {
        // Printing results of first innings
        System.out.println("First Innings : " + teams[0].getTeamName() + " Playing");
        teams[0] = calculateScore.getScore(1001, teams[0]);
        printScore(1);

        // Printing results of second innings
        System.out.println("Second Innings : " + teams[1].getTeamName() + " Playing");
        teams[1] = calculateScore.getScore(team1Score, teams[1]);
        printScore(2);
    }


    private void printScore(int innings)
    {
        if(innings == 1)
        {
            setTeamInformation(1);
            System.out.println("Final Score of Team " + teams[0].getTeamName() + " " + team1Score + "/" + teamWicket);

            System.out.println();
        }

        else
        {
            setTeamInformation(2);
            System.out.println("Final Score of Team " + teams[1].getTeamName() + " " + team2Score + "/" + teamWicket);

            System.out.println();
        }


    }

    private void setTeamInformation(int i)
    {
        if(i == 1)
            team1Score = calculateScore.getCurrentTeamScore();
        else
            team2Score = calculateScore.getCurrentTeamScore();

        teamWicket = calculateScore.getCurrentTeamWicket();
        teamBallsPlayed = calculateScore.getCurrentTeamTotalBallsPlayed();
    }

    public void declareWinner(Team[] teams)
    {
        // Deciding who is the winner
        GetWinner.findOutWinner(team1Score, team2Score, teams);
    }

    public void gameEnd()
    {
        // Todo
    }

    public void swap()
    {
        Team temp = teams[0];
        teams[0] = teams[1];
        teams[1] = temp;
    }
}