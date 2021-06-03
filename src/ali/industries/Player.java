package ali.industries;

public class Player {

    private static int playerLivePoints;
    private static int playerMoney;

    public Player(){
        playerLivePoints = 20;
        playerMoney = 0;
    }

    public static void setPlayerLivePoints(int playerLivePoints) {
        Player.playerLivePoints = playerLivePoints;
    }

    public static int getPlayerLivePoints() {
        return playerLivePoints;
    }

    public static void setPlayerMoney(int playerMoney){
        Player.playerMoney = playerMoney + 1 ;
    }

    public static int getPlayerMoney(){
        return playerMoney;
    }

}
