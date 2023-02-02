package generatePlayer;


import scoreCalculator.CalculateScore;

import java.util.Scanner;

public class InputValues
{
    private static int totalOvers = 0, totalPlayers = 0;
    public static String getPlayerNameInput(int currentPlayerIndex)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Player " + currentPlayerIndex + " Name : ");

        String playerName;

        try
        {
            playerName = sc.nextLine();
        }
        catch (Exception e)
        {
            System.out.println("Invalid Input");
            return getPlayerNameInput(currentPlayerIndex);
        }

        return playerName;
    }

    public static int getPlayerType()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose Player Type : Enter 1 for BATSMAN or 2 for BOWLER : ");
        int type = 2;

        try
        {
            type = sc.nextInt();
            if(type != 1 && type != 2)
            {
                System.out.println("You have entered Wrong Input, By default the player will be a Bowler");
                type = 2;
            }
        }
        catch (Exception e)
        {
            System.out.println("You have entered Wrong Input, By default the player will be a Bowler");
            type = 2;
        }

        return type;
    }

    public static String getTeamNameInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nPlease Enter Team Name : ");

        String name;

        try
        {
            name = sc.nextLine();
        }
        catch (Exception e)
        {
            System.out.println("Invalid Input");
            return getTeamNameInput();
        }

        return name;
    }

    public static int getTotalOversInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter total number of overs: ");

        int temp = 0;
        try {
            temp = sc.nextInt();
            CalculateScore.setMaxOvers(temp);
            InputValues.totalOvers = temp;
        }
        catch (Exception e)
        {
            System.out.println("Invalid Input");
            return getTotalOversInput();
        }

        return InputValues.totalOvers;
    }

    public static int getTotalPlayersInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter total number of players from each team : ");

        int temp = 5;

        try{
            temp = sc.nextInt();
            CalculateScore.setMaxWickets(temp - 1);
            InputValues.totalPlayers = temp;
        }
        catch (Exception e)
        {
            System.out.println("Invalid Input");
            return getTotalPlayersInput();
        }

        return InputValues.totalPlayers;
    }

    public static int getTotalPlayers()
    {
        return totalPlayers;
    }

    public static int getTotalOvers()
    {
        return totalOvers;
    }
}