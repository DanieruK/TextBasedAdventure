package ali.industries;

public class Armor extends Item{
    private double damageReduktion;

    public Armor( String pName, double pDamageReduktion, int pID,int pPrice) {
        super(pName, pPrice, pID);
        damageReduktion = pDamageReduktion;
    }

    public double getDamageReduktion() {
        return damageReduktion;
    }

}
