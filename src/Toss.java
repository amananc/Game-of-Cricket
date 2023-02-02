import team.Team;

public class Toss
{
    public boolean tossTheCoin(boolean chosenValue, Team[] teams)
    {
        boolean coinResult = flipACoin();

        if(coinResult)
            System.out.println("It's Heads");
        else
            System.out.println("It's Tails");

        if(coinResult == chosenValue)
        {
            System.out.println("Team " + teams[0].getTeamName() + " has won the toss and will play first");
            return true;

            // Todo : Let the winning team decide if they want batting or bowling.
//            System.out.print("Please press 1 for selecting batting and 2 for bowling : ");
//
//            Scanner sc = new Scanner(System.in);
//            int valueChosen = sc.nextInt();
//
//            if(valueChosen == 1)
//            {
//
//            }
        }

        System.out.println("Team " + teams[1].getTeamName() + " has won the toss and will play first");
        return false;
    }

    private boolean flipACoin()
    {
        int randomNumber = (int)(Math.random() * 10);

        if(randomNumber % 2 == 0)
            return true;

        return false;
    }
}
