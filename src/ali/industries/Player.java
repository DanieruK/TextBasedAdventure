package ali.industries;

public class Player {

    private int playerLivePoints;
    private int playerLevel;

    public Player(){
        playerLivePoints = 100;
    }

    public void setPlayerLivePoints(int playerLivePoints) {
        this.playerLivePoints = playerLivePoints;
    }

    public int getPlayerLivePoints() {
        return playerLivePoints;
    }
}
