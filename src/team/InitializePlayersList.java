package team;

import generatePlayer.GeneratePlayer;
import generatePlayer.InputValues;
import playerPackage.Player;

import java.util.ArrayList;

public class InitializePlayersList
{
    GeneratePlayer generatePlayer = new GeneratePlayer();
    int currentNumberOfPlayersInitialized = 0;
    int totalPlayers = InputValues.getTotalPlayers();
    ArrayList <Player> playersList = new ArrayList<>();

    public ArrayList<Player> initializePlayers()
    {
        while(currentNumberOfPlayersInitialized < totalPlayers)
        {
            Player player = new Player(InputValues.getPlayerNameInput(currentNumberOfPlayersInitialized + 1), generatePlayer.generatePlayerAge(), InputValues.getPlayerType());
            playersList.add(player);

            currentNumberOfPlayersInitialized++;
        }

        return playersList;
    }
}