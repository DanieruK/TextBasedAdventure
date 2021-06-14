package ali.industries;

public class Weapon extends Item {
    private int damage;

    public Weapon(String pName, int pDamage, int pPrice, int pID) {
        super(pName, pPrice, pID);
    }

    public int getDamage() {
        return damage;
    }

}
