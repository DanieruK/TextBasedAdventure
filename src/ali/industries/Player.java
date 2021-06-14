package ali.industries;

public class Player {

    private static int playerLivePoints;
    private static int playerMoney;
    public static Armor currentArmor;
    public static Weapon currentWeapon;

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

    public static void setCurrentArmor(Armor currentArmor) {
        Player.currentArmor = currentArmor;
    }

    public static Armor getCurrentArmor() {
        return currentArmor;
    }

    public static void setCurrentWeapon(Weapon currentWeapon) {
        Player.currentWeapon = currentWeapon;
    }

    public static Weapon getCurrentWeapon() {
        return currentWeapon;
    }


}
