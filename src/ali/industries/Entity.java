package ali.industries;

public class Entity {

    protected String name;
    protected int entityLivePoints;
    protected int damage;

    Player aPlayer;

    public Entity(String pName, int pLP, int pDamage, int pLVL, Player pPlayer){
        name = pName;
        entityLivePoints = pLP;
        damage  = pDamage;
        this.aPlayer=pPlayer;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setEntityLivePoints(int entityLivePoints) {
        this.entityLivePoints = entityLivePoints;
    }

    public void setName(String name) {
        this.name = name;
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
        aPlayer.setPlayerLivePoints(aPlayer.getPlayerLivePoints()-(int)(damage*pArmorDamagRedukion));
    }



}
