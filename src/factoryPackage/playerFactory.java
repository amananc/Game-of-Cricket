package factoryPackage;

import playerPackage.Batsman;
import playerPackage.Bowler;
import playerPackage.Player;

public class playerFactory
{
    public static Player getPlayer(PlayerType player)
    {
        if(player == PlayerType.BATSMAN)
            return new Batsman();

        return new Bowler();
    }
}