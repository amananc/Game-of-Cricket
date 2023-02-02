package playerPackage;

public class Bowler extends Player
{
    private int totalWicketTaken, totalRunsGiven, totalBallsThrown;

    public Bowler()
    {
        super();
    }

    public Bowler(String name, int age, String team, int playerType)
    {
        super(name, age, playerType);

        this.totalWicketTaken = 0;
        this.totalRunsGiven = 0;
        this.totalBallsThrown = 0;
    }

    public int getTotalWicketTaken() {
        return totalWicketTaken;
    }

    public void setTotalWicketTaken(int totalWicketTaken) {
        this.totalWicketTaken = totalWicketTaken;
    }

    public int getTotalRunsGiven() {
        return totalRunsGiven;
    }

    public void setTotalRunsGiven(int totalRunsGiven) {
        this.totalRunsGiven = totalRunsGiven;
    }

    public int getTotalBallsThrown() {
        return totalBallsThrown;
    }

    public void setTotalBallsThrown(int totalBallsThrown) {
        this.totalBallsThrown = totalBallsThrown;
    }
}