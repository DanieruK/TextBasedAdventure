package ali.industries;

public class Entity {

    protected String name;
    protected int entityLivePoints;
    protected int damage;

    Weapon aWeapon;
    Player aPlayer;
    Armor aArmor;

    public Entity(String pName, int pLP, int pDamage, int pLVL, Player pPlayer){
        name = pName;
        entityLivePoints = pLP;
        damage  = pDamage;
        this.aPlayer=pPlayer;
    }

    public void setEntityLivePoints(int entityLivePoints) {
        this.entityLivePoints = entityLivePoints;
    }

    public int getDamage() {
        return damage;
    }

    public int getEntityLivePoints() {
        return entityLivePoints;
    }

    public String getName() {
        return name;
    }

    public void attack(double pArmorDamagRedukion){
        aPlayer.setPlayerLivePoints(aPlayer.getPlayerLivePoints()-(int)(damage*Player.getCurrentArmor().getDamageReduktion()));
    }

    public void takeDamage(){
     setEntityLivePoints(getEntityLivePoints()-Player.getCurrentWeapon().getDamage());
    }
}
