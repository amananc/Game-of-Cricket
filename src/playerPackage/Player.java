package playerPackage;

import factoryPackage.PlayerType;

public class Player
{
    private String name;
    private int age, runsScored, ballsPlayed, total4Scored, total6Scored;

    private PlayerType playerType;

    public Player()
    {

    }

    public Player(String name, int age, int playerType)
    {
        this.name = name;
        this.age = age;

        this.runsScored = 0;
        this.ballsPlayed = 0;
        this.total4Scored = 0;
        this.total6Scored = 0;

        if(playerType == 1)
            this.playerType = PlayerType.BATSMAN;
        else
            this.playerType = PlayerType.BOWLER;
    }

    public static void show(Player player)
    {
        System.out.println("Player Name : " + player.name + " " + "Balls Played : " + player.ballsPlayed + " " + "Runs Scored : " + player.runsScored);
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }

    public int getBallsPlayed() {
        return ballsPlayed;
    }

    public void setBallsPlayed(int ballsPlayed) {
        this.ballsPlayed = ballsPlayed;
    }

    public int getTotal4Scored() {
        return total4Scored;
    }

    public void setTotal4Scored(int total4Scored) {
        this.total4Scored = total4Scored;
    }

    public int getTotal6Scored() {
        return total6Scored;
    }

    public void setTotal6Scored(int total6Scored) {
        this.total6Scored = total6Scored;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

}