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

    public static Boolean getPlayerAlive() {
        return playerAlive;
    }

    public static void attack() {
        currenDemon.setEntityLivePoints(currenDemon.getEntityLivePoints() - currentWeapon.getDamage());
        if (currenDemon.getEntityLivePoints() <= 0){
            currenDemon.kill();
        }
    }

    public static void takeDamage(){
        if (currenDemon.getEntityLife() == true){
            setPlayerLivePoints(getPlayerLivePoints() - (int)(currenDemon.getDamage() * currentArmor.getDamageReduktion()));
            if (getPlayerLivePoints() <= 0){
                killPlayer();
            }
        }
    }
}
