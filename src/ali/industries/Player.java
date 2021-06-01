package ali.industries;

public class Player {

    protected int playerLivePoints;
    private int playerLevel;
    protected int playerMoney;

    public Player(){
        playerLivePoints = 20;
        playerMoney = 0;
    }

    public void setPlayerLivePoints(int playerLivePoints) {
        this.playerLivePoints = playerLivePoints;
    }

    public int getPlayerLivePoints() {
        return playerLivePoints;
    }

    public void setPlayerMoney(int playerMoney){
        this.playerMoney = playerMoney + 1 ;
    }

    public int getPlayerMoney(){
        return playerMoney;
    }

}
