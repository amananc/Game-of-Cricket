package team;

import playerPackage.Player;
import generatePlayer.InputValues;

import java.util.ArrayList;
import java.util.Locale;

public class Team
{
    InitializePlayersList initializePlayersList = new InitializePlayersList();
    private String teamName;
    private int totalPlayers, totalTeamScore, total4ScoredByTeam, total6ScoredByTeam, totalWicketsFallen;
    ArrayList<Player> playersList = new ArrayList<>();

    public Team()
    {
        this.teamName = InputValues.getTeamNameInput();
        this.totalPlayers = InputValues.getTotalPlayers();

        this.playersList = initializePlayersList.initializePlayers();

        this.total4ScoredByTeam = 0;
        this.total6ScoredByTeam = 0;
        this.totalTeamScore = 0;
        this.totalWicketsFallen = 0;
    }

    public void show(Team team)
    {
        System.out.println(team.teamName + " " + team.totalTeamScore + "/" + team.totalWicketsFallen);
        System.out.println("Scoreboard");

        ArrayList <Player> playerList = team.playersList;

        for(Player player : playerList)
            Player.show(player);
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getTotalPlayers() {
        return totalPlayers;
    }

    public void setTotalPlayers(int totalPlayers) {
        this.totalPlayers = totalPlayers;
    }

    public int getTotalTeamScore() {
        return totalTeamScore;
    }

    public void setTotalTeamScore(int totalTeamScore) {
        this.totalTeamScore = totalTeamScore;
    }

    public int getTotal4ScoredByTeam() {
        return total4ScoredByTeam;
    }

    public void setTotal4ScoredByTeam(int total4ScoredByTeam) {
        this.total4ScoredByTeam = total4ScoredByTeam;
    }

    public int getTotal6ScoredByTeam() {
        return total6ScoredByTeam;
    }

    public void setTotal6ScoredByTeam(int total6ScoredByTeam) {
        this.total6ScoredByTeam = total6ScoredByTeam;
    }

    public int getTotalWicketsFallen() {
        return totalWicketsFallen;
    }

    public void setTotalWicketsFallen(int totalWicketsFallen) {
        this.totalWicketsFallen = totalWicketsFallen;
    }

    public ArrayList<Player> getPlayersList() {
        return playersList;
    }

    public void setPlayersList(ArrayList<Player> playersList) {
        this.playersList = playersList;
    }
}