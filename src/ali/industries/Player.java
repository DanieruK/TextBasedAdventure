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
        playerMoney = 100;
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

    public static void attackBoss(){
        EntityData.fynal.setEntityLivePoints(EntityData.fynal.getEntityLivePoints() - Player.getCurrentWeapon().getDamage());
        if (EntityData.fynal.getEntityLivePoints() <= 0){
            EntityData.fynal.kill();
        }
    }

    public static void takeDamageBoss(){
        if (EntityData.fynal.getEntityLife() == true){
            EntityData.fynal.setCombatCounter((int)(Math.random() * 20));
            if( EntityData.fynal.getEntityLife() == true){
                if (EntityData.fynal.getFirstAttackCounter() == 1){
                    setPlayerLivePoints(getPlayerLivePoints() - EntityData.fynal.getFirstAttackDamage());
                    EntityData.fynal.reduceFirstAttackCounter();
                }else if (EntityData.fynal.getCombatCounter() <= 15){
                    setPlayerLivePoints(getPlayerLivePoints() - (int)(EntityData.fynal.getDamage() * currentArmor.getDamageReduktion()));
                }else if (EntityData.fynal.getCombatCounter() > 15 &&  EntityData.fynal.getCombatCounter() <= 17){
                    setPlayerLivePoints(getPlayerLivePoints() - (int)(EntityData.fynal.getDamage2() * currentArmor.getDamageReduktion()));
                }else if (EntityData.fynal.getCombatCounter() > 17 && EntityData.fynal.getHealingCounter() > 0){
                    EntityData.fynal.setEntityLivePoints(EntityData.demonLVL1.getEntityLivePoints() + 80 );
                    if (EntityData.fynal.getEntityLivePoints() > 200){
                        EntityData.fynal.setCombatCounter(200);
                    }
                }else if (EntityData.fynal.getHealingCounter() == 0){
                    takeDamageBoss();
                }
            }
        }
    }

    // Blocken Fehlschlagen 1/5
    // Blocken teilweise 3/5
    // Blocken erfolgreich 1/5
    // TODO

    public static void blockAttack(){
        combatcounter = (int)(Math.random() * 4);
        if (combatcounter == 1){
            setPlayerLivePoints(getPlayerLivePoints() - (int)(currenDemon.getDamage() * currentArmor.getDamageReduktion()));
            setTakenDamage((int)(currenDemon.getDamage() * currentArmor.getDamageReduktion()));
            if (getPlayerLivePoints() <= 0){
                killPlayer();
            }
        }else if (combatcounter > 1 && combatcounter <=3){
            setPlayerLivePoints(getPlayerLivePoints() - (int)(currenDemon.getDamage() * currentArmor.getDamageReduktion() * 0.5));
            setTakenDamage((int)(currenDemon.getDamage() * currentArmor.getDamageReduktion() * 0.5));
            if (getPlayerLivePoints() <= 0){
                killPlayer();
            }
        }
    }

    public static void blockBossAttack(){
        combatcounter = (int)(Math.random() * 4);
        if (combatcounter == 1){
            setPlayerLivePoints(getPlayerLivePoints() - (int)(EntityData.fynal.getDamage() * currentArmor.getDamageReduktion()));
            setTakenDamage((int)(EntityData.fynal.getDamage() * currentArmor.getDamageReduktion()));
            if (getPlayerLivePoints() <= 0){
                killPlayer();
            }
        }else if (combatcounter > 1 && combatcounter <=3){
            setPlayerLivePoints(getPlayerLivePoints() - (int)(EntityData.fynal.getDamage() * currentArmor.getDamageReduktion() * 0.5));
            setTakenDamage((int)(EntityData.fynal.getDamage() * currentArmor.getDamageReduktion() * 0.5));
            if (getPlayerLivePoints() <= 0){
                killPlayer();
            }
        }
    }

    // TODO Healing Potion auf 50 setzten und nur einmal verwendbar

}
