package ali.industries;

public class Player {

    private static int playerLivePoints;
    private static int playerMoney;
    private static Boolean playerAlive = true;
    public static Armor currentArmor = ItemData.none;
    public static Weapon currentWeapon;
    public static Demon currenDemon;

    public static GUI aGUI;

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
        Player.playerMoney = playerMoney;
    }

    public static int getPlayerMoney(){
        return playerMoney;
    }

    public static void killPlayer() {
        Player.playerAlive = false;
    }

    public static void setCurrentWeapon(Weapon currentWeapon) {
        Player.currentWeapon = currentWeapon;
    }

    public static Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public static void setCurrenDemon(Demon currenDemon) {
        Player.currenDemon = currenDemon;
    }

    public static void attack() {
        //TODO
    }

    public static void takeDamage(){
        //TODO
    }
}
