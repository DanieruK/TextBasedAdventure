package ali.industries;

public class Player {

    protected int playerLivePoints;
    private int playerLevel;

    public Player(){
        playerLivePoints = 20;
    }

    public void setPlayerLivePoints(int playerLivePoints) {
        this.playerLivePoints = playerLivePoints;
    }

    public int getPlayerLivePoints() {
        return playerLivePoints;
    }
}
