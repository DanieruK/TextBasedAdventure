package ali.industries;

public class Entity {

    protected String name;
    protected int entityLivePoints;
    protected int damage;
    protected Boolean entityLife;

    public Entity(String pName, int pLP, int pDamage){
        name = pName;
        entityLivePoints = pLP;
        damage  = pDamage;
        entityLife = true;
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

    public void kill() {
        this.entityLife = false;
    }

    public Boolean getEntityLife() {
        return entityLife;
    }
}
