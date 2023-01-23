import java.lang.Math;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Game of Cricket");

        Player team1[] = new Player[11];
        Player team2[] = new Player[11];

        for(int i = 0; i < 11; i++)
        {
            team1[i] = new Player(generatePlayerName(i), generatePlayerAge(), "team1");
            team2[i] = new Player(generatePlayerName(i + 11), generatePlayerAge(), "team2");
        }

        // Need to show wickets too... will do it later

        System.out.println("First Innings : Team1 Playing");
        int team1Score = calculateScore(1001);
        System.out.println();
        System.out.println("Team 1 Score : " + team1Score);

        System.out.println();
        System.out.println("Second Innings : Team2 Playing");
        int team2Score = calculateScore(team1Score);
        System.out.println();
        System.out.println("Team2 Score : " + team2Score );

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


    public static int calculateScore(int maxScore)
    {
        int totalScore = 0;
        int totalWicket = 0;

        for(int i = 0; i < 20; i++)
        {
            for(int j = 0; j < 6; j++)
            {
                int scoreOnCurrentBall = getScoreOnCurrentBall();

                if(scoreOnCurrentBall > 6)
                {
                    totalWicket++;
                    System.out.print("W ");
                }
                else
                {
                    totalScore += scoreOnCurrentBall;
                    System.out.print(scoreOnCurrentBall + " ");
                }

                if(totalScore > maxScore || totalWicket >= 10)
                {
                    break;
                }
            }

            if(totalScore > maxScore || totalWicket >= 10)
                break;

            System.out.println();
        }

        return totalScore;
    }

    public static int getScoreOnCurrentBall()
    {
        int randomNumber = (int)(Math.random() * 10);
        int score = randomNumber % 8;

        return score;
    }


    public static String generatePlayerName(int i)
    {
        String str = "";
        str += (char)('a' + i);
        return str;
    }

    public static int generatePlayerAge()
    {
        int max = 36;
        int min = 20;

        int age = (int)(Math.random() * (max - min + 1) + min);
        return age;
    }
}