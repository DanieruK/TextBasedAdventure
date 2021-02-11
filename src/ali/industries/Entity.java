package ali.industries;

public class Entity {

    protected String name;
    protected int entityLivePoints;
    protected int damage;
    protected int level;
    protected int xpDrop;

    public Entity(String pName, int pLP, int pDamage, int pLVL, int pXP){
        name = pName;
        entityLivePoints = pLP;
        damage  = pDamage;
        level = pLVL;
        xpDrop = pXP;

    }

}
