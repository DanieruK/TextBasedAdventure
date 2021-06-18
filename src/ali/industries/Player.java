package ali.industries;

public class Player {

    private static int playerLivePoints;
    private static int playerMoney;
    private static int combatcounter;
    private static int takenDamage;
    private static Boolean playerAlive = true;
    public static Armor currentArmor = ItemData.none;
    public static Weapon currentWeapon;
    public static Demon currenDemon;

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

    public static void setCurrentArmor(Armor currentArmor) {
        Player.currentArmor = currentArmor;
    }

    public static void attack() {
        currenDemon.setEntityLivePoints(currenDemon.getEntityLivePoints() - currentWeapon.getDamage());
        if (currenDemon.getEntityLivePoints() <= 0){
            currenDemon.kill();
        }
    }

    public static int getCombatcounter() {
        return combatcounter;
    }

    public static void setTakenDamage(int takenDamage) {
        Player.takenDamage = takenDamage;
    }

    public static int getTakenDamage() {
        return takenDamage;
    }

    public static void takeDamage(){
        if (currenDemon.getEntityLife() == true){
            setPlayerLivePoints(getPlayerLivePoints() - (int)(currenDemon.getDamage() * currentArmor.getDamageReduktion()));
            if (getPlayerLivePoints() <= 0){
                killPlayer();
            }
        }
    }

    public static void blockAttack(){
        combatcounter = (int)(Math.random() * 3);
        if (combatcounter == 1){
            setPlayerLivePoints(getPlayerLivePoints() - (int)(currenDemon.getDamage() * currentArmor.getDamageReduktion()));
            setTakenDamage((int)(currenDemon.getDamage() * currentArmor.getDamageReduktion()));
            if (getPlayerLivePoints() <= 0){
                killPlayer();
            }
        }else if (combatcounter == 2){
            setPlayerLivePoints(getPlayerLivePoints() - (int)(currenDemon.getDamage() * currentArmor.getDamageReduktion() * 0.5));
            setTakenDamage((int)(currenDemon.getDamage() * currentArmor.getDamageReduktion() * 0.5));
            if (getPlayerLivePoints() <= 0){
                killPlayer();
            }
        }
    }
}
